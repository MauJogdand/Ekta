package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		getItByTomorrowCheckBox.click();
	}
	
	public void ProductIphone13mini()
	{
		System.out.println(productIphone13mini.getText());
	}
	public void clickOniPhone14StarLight()
	{
		iPhone14StarLight.click();
	}
}
