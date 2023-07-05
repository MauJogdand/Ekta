package a4TestNGPack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import a1BasePack.Base;
import a2UtilityPack.Utility;
import a3POMPack.AmazonHomePage;
import a3POMPack.AmazonLaunchPOM;
import a3POMPack.AmazonPOM;
import a3POMPack.IphonePage;

//@Listeners(a5Listeners.Listener.class)
public class Amazon_E_Commerce_Project_Chrome extends Base
{
	//Creating Objects of all POM classes.

	AmazonHomePage ahp;
	AmazonLaunchPOM alp;
	AmazonPOM ap;
	IphonePage ip;

	@BeforeClass
	public void beforeClassMethod() throws EncryptedDocumentException, IOException 
	{
		// Launching Browser
		launchBrowser();
		alp= new AmazonLaunchPOM(driver);

		//Clicking on account and List Options
		alp.clickOnAccountAndList();
		Utility.wait(driver, 1000);
		ap=new AmazonPOM(driver);

		//Entering UserName/MobileNumber
		ap.enterUserID(Utility.excelread(0, 0));
		ap.clickOnContinueButton();


		//Entering Password
		ap.enterPassword(Utility.excelread(0, 1));
		ap.clickOnSubmitButton();

	}

	@Test
	public void TestSearchBox() 
	{
		//searching Items 
		ahp=new AmazonHomePage(driver);
		ip=new IphonePage(driver);
		Utility.wait(driver, 1000);
		ahp.searchItem();
		ahp.clickOnsearchButton();
		ip.ProductIphone13mini();
		//ip.selectgetItByTomorrowCheckBox();
	}
	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException
	{
		Set<String> wndhndl = driver.getWindowHandles();

		ArrayList<String> al= new ArrayList<>(wndhndl);
		driver.switchTo().window(al.get(0));

		//Validating UserName
		ahp=new AmazonHomePage(driver);
		Assert.assertEquals(ahp.validateUserName(), Utility.excelread(0, 0), "Actual and Expected User Names are not equal TC Failed");

	}

	@AfterClass
	public void afterClassM() {

		//Clicking on logout Button
		ahp=new AmazonHomePage(driver);
		ahp.mouseHoverToaccountAndList(driver);
		ahp.clickONlogOutbutton();
		Utility.wait(driver, 2000);

		//Closing the Browser.
		closeBrowser();

	}



}

