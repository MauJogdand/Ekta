package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IPhone13PageSecondPage {
	
	@FindBy(id="imgTagWrapperId")private WebElement appleStarLightPhone;
	
	public IPhone13PageSecondPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void imageZooming(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(appleStarLightPhone).perform();
		
		
		act.moveToElement(appleStarLightPhone, 100, 50).perform();
	}

}
