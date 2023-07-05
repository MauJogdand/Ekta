package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchBoxHMPage;
	@FindBy(id="nav-search-submit-button") private WebElement searchButton;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signOutButton;
    @FindBy(xpath="//span[text()='Account & Lists']")private WebElement accountAndList;
    
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void searchItem()
	{
		searchBoxHMPage.sendKeys("iPhone 13");
	}
	public void clickOnsearchButton()
	{
		searchButton.click();
	}

	public void signOut()
	{
		signOutButton.click();
	}
	public void mouseHoverToaccountAndList(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.moveToElement(accountAndList).perform();
		
	}

}
