package Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		AmazonLaunchPOM alp=new AmazonLaunchPOM(driver);
		
		alp.clickOnAccountAndList();
		AmazonPOM ap=new AmazonPOM(driver);
		
		ap.enterUserID(CommonMethods.readingExcelsheet("Amazon_Excel", 0, 0));
		CommonMethods.captureScreenShot(driver, "UserIDPage.png");
		ap.clickOnContinueButton();
		
		ap.enterPassword(CommonMethods.readingExcelsheet("Amazon_Excel", 0, 1));
		CommonMethods.captureScreenShot(driver, "PasswordPage.png");
		ap.clickOnSubmitButton();
		
		AmazonHomePage ahp=new AmazonHomePage(driver);
		Thread.sleep(2000);
		ahp.searchItem();
		ahp.clickOnsearchButton();
		
		IphonePage ipp=new IphonePage(driver);
		//Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		CommonMethods.captureScreenShot(driver, "iPhonePage.png");
		ipp.selectgetItByTomorrowCheckBox();
		ipp.ProductIphone13mini();
	}

}
