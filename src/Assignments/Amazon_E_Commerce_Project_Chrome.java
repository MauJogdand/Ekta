package Assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon_E_Commerce_Project_Chrome {
	WebDriver driver;
	AmazonHomePage ahp;
	AmazonLaunchPOM alp;
	AmazonPOM ap;
	IphonePage ip;

	@Test
	public void TestSearchBox() {
		ahp=new AmazonHomePage(driver);
		ip=new IphonePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		ahp.searchItem();
		ahp.clickOnsearchButton();
		ip.ProductIphone13mini();
		ip.selectgetItByTomorrowCheckBox();
	}

	@BeforeMethod
	public void beforeMethod() throws Exception, IOException {
		ap=new AmazonPOM(driver);
		ap.enterUserID(CommonMethods.readingExcelsheet("Amazon_Excel", 0, 0));
		ap.clickOnContinueButton();
		ap.enterPassword(CommonMethods.readingExcelsheet("Amazon_Excel", 0, 1));
		ap.clickOnSubmitButton();

	}
	@AfterMethod
	public void afterMethod() {
		
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		alp=new AmazonLaunchPOM(driver);
        alp.clickOnAccountAndList();

	}

	
}

