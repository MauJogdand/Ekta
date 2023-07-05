package pomPack;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Assignments.CommonMethods;

public class TestPOM {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("disable-notifications");
		
		  WebDriver driver= new ChromeDriver(opt);
		  driver.get("https://www.policybazaar.com/");
		  
		  LoginDemo ld=new LoginDemo(driver);
		  ld.ClickingHPsignInButton();
		  Thread.sleep(2000);
		  ld.EnterMNOInUserIDField();
		  Thread.sleep(2000);
		  ld.ClickOnSignInButton1();
		  Thread.sleep(2000);
		  ld.EnterMNOInUserIDField();
		  Thread.sleep(2000);
		  ld.ClickOnSignInButton2();
		  
		  MyAccountPage map=new MyAccountPage(driver);
		  CommonMethods.implicitWait(driver, 1000);
		  
		  map.validateUserName();
		  
		  
		  

		  
		  
	}

}
