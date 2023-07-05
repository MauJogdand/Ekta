package a4TestNGPack;

import org.testng.annotations.Test;

import a2UtilityPack.Utility;
import a3POMPack.AmazonHomePage;
import a3POMPack.AmazonLaunchPOM;
import a3POMPack.AmazonPOM;
import a3POMPack.IPhone13PageSecondPage;
import a3POMPack.IphonePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Amazon_E_Commerce_Project {

	WebDriver driver;
	AmazonHomePage ahp;
	AmazonLaunchPOM alp;
	AmazonPOM ap;
	IphonePage ip;
	IPhone13PageSecondPage ipsp;

	@Parameters("Browser_Name")
	@BeforeClass
	public void beforeClass(String bname)
	{

		if(bname.equals("Edge")) 
		{
			driver= new EdgeDriver();
		}
		else if(bname.equals("Chrome"))
		{

			driver=new ChromeDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		alp=new AmazonLaunchPOM(driver);
		alp.clickOnAccountAndList();
	}

	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		ap=new AmazonPOM(driver);
		ap.enterUserID(Utility.excelread(0, 0));
		ap.clickOnContinueButton();
		ap.enterPassword(Utility.excelread(0, 1));
		ap.clickOnSubmitButton();

	}

	@Test(priority=1)
	public void TestSearchBox() throws Exception {

		ahp=new AmazonHomePage(driver);
		ip=new IphonePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		ahp.searchItem();
		ahp.clickOnsearchButton();
		ip.ProductIphone13mini();
		ip.selectgetItByTomorrowCheckBox();
		ip.clickOniPhone14StarLight();
		Thread.sleep(2000);

		Set<String> winhdl = driver.getWindowHandles();

		List<String> li= new ArrayList<>(winhdl);
		driver.switchTo().window(li.get(1));
		Thread.sleep(2000);
		Utility.captureScreenShot(driver, "SecondPage");

		List<WebElement> frameList = driver.findElements(By.xpath("//iframe"));
		//Reporter.log("Count on Frames on the second page is :", frameList.size());
		System.out.println(frameList.size());
		ipsp.imageZooming(driver);
	}

	@AfterMethod
	public void afterMethod() {
		ahp=new AmazonHomePage(driver);
		ahp.mouseHoverToaccountAndList(driver);
		ahp.signOut();
	}

	@AfterClass
	public void afterClass()

	{
		driver.quit();
	}
}



