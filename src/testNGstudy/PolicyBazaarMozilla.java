package testNGstudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Assignments.CommonMethods;

public class PolicyBazaarMozilla {
  @Test
  public void polBaz() throws Exception {
	  
		WebDriver driver= new FirefoxDriver();

		driver.get("https://www.policybazaar.com/");

		driver.manage().window().maximize();

		//Click on the sing in button
		CommonMethods.implicitWait(driver, 1000);
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		CommonMethods.implicitWait(driver, 1000);

		//Enter Mobile Number
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("7757013834");
		CommonMethods.captureScreenShot(driver, "MobileNumPage");

		//Click on sing in button
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		CommonMethods.implicitWait(driver, 1000);

		//enter Password
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("PolBaz@1331");
		CommonMethods.captureScreenShot(driver, "PasswordPage");

		driver.findElement(By.id("login-in-with-password-span")).click();
		Thread.sleep(2000);

		//My account mouse hover
		Actions act= new Actions(driver);
		WebElement myAccount = driver.findElement(By.xpath("//div[@class='userprofile'][text()='My Account']"));
		act.moveToElement(myAccount).click().build().perform();	
		CommonMethods.implicitWait(driver, 1000);

		//click on MyProfile Option
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		CommonMethods.captureScreenShot(driver, "MyProfilePage");

		CommonMethods.implicitWait(driver, 1000);

		Set<String> windhndl = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(windhndl);

		String childPage = arr.get(1);
		driver.switchTo().window(childPage);

		CommonMethods.implicitWait(driver, 1000);
		//click on female  button
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		//enter Name
		WebElement nameField = driver.findElement(By.name("personName"));
		nameField.clear();
		nameField.sendKeys("Ekta K");

		//enter Mobile Number
		//driver.findElement(By.xpath("//input[@name='mobNo']")).sendKeys("7757013834");

		//enter Email ID
		WebElement emailID = driver.findElement(By.xpath("//input[@id='outlined-secondary'][@name='email']"));
		emailID.clear();
		emailID.sendKeys("eak13213@gmail.com");

		//Select Date
		driver.findElement(By.xpath("//span[@class='MuiIconButton-label']")).click();

		//Select Date
		driver.findElement(By.xpath("//span[@class='MuiIconButton-label']/p[text()='4']")).click();

		//click on ok button
		driver.findElement(By.xpath("//span[text()='OK']")).click();

		//click on annual income tab
		WebElement AnnualIncome = driver.findElement(By.xpath("(//div[@id='outlined-secondary'])[1]"));
		AnnualIncome.click();
		driver.findElement(By.xpath("//li[text()='7 - 10 lakhs']")).click();
		Select s=new Select(AnnualIncome);
		s.selectByVisibleText("7 - 10 lakhs");

		//click on Marital status
		WebElement maritalStatus = driver.findElement(By.xpath("(//div[@id='outlined-secondary'])[2]"));
	     maritalStatus.click();
		Select s1=new Select(maritalStatus);
		s1.selectByVisibleText("Married");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

		//click on city tab and send the value
		driver.findElement(By.xpath("(//input[@id='outlined-secondary'])[5]")).sendKeys("Nagpur,Maharashtra");


		//click on save button
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.quit();

  }
}
