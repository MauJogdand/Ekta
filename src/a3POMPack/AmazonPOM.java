package a3POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AmazonPOM {

	@FindBy(xpath="//input[@id='ap_email']") private WebElement userIDField;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueButton;
	@FindBy(xpath="//input[@id='ap_password']")private WebElement paswordField;
	@FindBy(id= "signInSubmit")private WebElement submitButton;

	public AmazonPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterUserID(String mobileNum)
	{
		Reporter.log("TC enterUserID is running",true);
		userIDField.sendKeys(mobileNum);

	}
	public void clickOnContinueButton()
	{
		Reporter.log("TC clickOnContinueButton is running",true);
		continueButton.click();
	}

	public void enterPassword(String password)
	{
		Reporter.log("TC enterPassword is running",true);
		paswordField.sendKeys(password);
	}

	public void clickOnSubmitButton()
	{
		Reporter.log("TC clickOnSubmitButton is running",true);
		submitButton.click();
	}


}
