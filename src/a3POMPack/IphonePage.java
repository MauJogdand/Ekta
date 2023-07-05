package a3POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class IphonePage {
	
	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")private WebElement getItByTomorrowCheckBox;
	@FindBy(xpath ="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")private WebElement productIphone13mini;
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")private WebElement iPhone14StarLight;
	
	public IphonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectgetItByTomorrowCheckBox()

	{
		Reporter.log("TC selectgetItByTomorrowCheckBox is running", true);
		getItByTomorrowCheckBox.click();
	}
	
	public void ProductIphone13mini()
	{
		Reporter.log("TC ProductIphone13mini is running", true);
		System.out.println(productIphone13mini.getText());
	}
	public void clickOniPhone14StarLight()
	{
		Reporter.log("TC clickOniPhone14StarLight is running", true);
		iPhone14StarLight.click();
	}
}
