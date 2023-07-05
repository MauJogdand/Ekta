package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		userIDField.sendKeys(mobileNum);

	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}

	public void enterPassword(String password)
	{
		paswordField.sendKeys(password);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}


}
