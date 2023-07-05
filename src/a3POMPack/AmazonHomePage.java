package a3POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AmazonHomePage {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchBoxHMPage;
	@FindBy(id="nav-search-submit-button") private WebElement searchButton;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signOutButton;
	@FindBy(xpath="//span[text()='Account & Lists']")private WebElement accountAndList;
	@FindBy(xpath="//span[text()='Hello, ekta']")private WebElement userName;
	@FindBy(xpath = "//span[text()='Sign Out']")private WebElement logOutbutton;


	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void searchItem()
	{    
		Reporter.log("TC searchItem is running",true);
		searchBoxHMPage.sendKeys("iPhone 13");
	}
	public void clickOnsearchButton()
	{
		Reporter.log("TC clickOnsearchButton is running",true);
		searchButton.click();
	}

	public void signOut()
	{
		Reporter.log("TC signOut is running",true);

		signOutButton.click();
	}
	public void mouseHoverToaccountAndList(WebDriver driver)
	{   
		Actions act= new Actions(driver);
		act.moveToElement(accountAndList).perform();
		Reporter.log("TC mouseHoverToaccountAndList is running",true);
	}
	public String validateUserName()
	{
		String name = userName.getText();
		Reporter.log("TC validateUserName is running",true);

		return name;

	}
	public void clickONlogOutbutton()
	{
		logOutbutton.click();
		Reporter.log("TC clickONlogOutbutton is running",true);

	}

}
