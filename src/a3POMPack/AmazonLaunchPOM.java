package a3POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AmazonLaunchPOM {
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement AccountAndList;
	
	public AmazonLaunchPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAccountAndList()
	{
		Reporter.log("TC clickOnAccountAndList is running",true);
		AccountAndList.click();
	}
	

}
