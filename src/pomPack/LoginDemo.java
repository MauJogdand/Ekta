package pomPack;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemo {

	
	//variable
	@FindBy(xpath = "//a[text()='Sign in']") private WebElement
	signInButtonHomePage;

	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement
	mobileNumberFiled;

	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private
	WebElement signInWithPassword;

	@FindBy(name="password") private WebElement passwordField;

	@FindBy(xpath = "//span[text()='Sign in']") private WebElement signInButton;

	@FindBy(xpath = "//div[text()='My Account']") private WebElement
	myAccountButton;

	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement myProfile;

	//constructor

	public LoginDemo(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	//methods

	public void ClickingHPsignInButton()
	{
	signInButtonHomePage.click();
	}

	public void EnterMNOInUserIDField()
	{
	mobileNumberFiled.sendKeys("7757013834");
	}

	public void ClickOnSignInButton1()
	{
	signInWithPassword.click();
	}

	public void enterPassword()
	{
	passwordField.sendKeys("PolBaz@1331");
	}

	public void ClickOnSignInButton2()
	{
	signInButton.click();
	}

	public void clickOnMyAccountButton()
	{
	myAccountButton.click();
	}

	public void clickOnMyProfileButton()
	{

	myProfile.click();
	}
	

}
