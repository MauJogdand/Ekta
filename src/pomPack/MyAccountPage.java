package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	//variable
	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private
	WebElement userName;
	//constructor
	public MyAccountPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//methods
	public void validateUserName()
	{
	String actualUN = userName.getText();
	String expUN="Ekta K";
	if(expUN.equals(actualUN))
	{
	System.out.println("Actual and Expected user Names are matching TC is Passed");
	}
	else
	{

	System.out.println("Actual and Expected user Names are not-matching TC is Failed");
	}
	}
	

}
