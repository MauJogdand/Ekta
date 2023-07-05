package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLaunchPOM {
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement AccountAndList;
	
	public AmazonLaunchPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAccountAndList()
	{
		AccountAndList.click();
	}
	

}
