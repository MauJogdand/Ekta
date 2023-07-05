package dropDownMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonAuto {

	public static void main(String[] args) throws InterruptedException, Exception {
      
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]")).click();
		 
		 Thread.sleep(100);
		// driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[2]")).click();
		// Thread.sleep(1000);

		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("1234567890");
		 driver.findElement(By.name("email")).sendKeys("1234567890");
		 Thread.sleep(1000);
		 driver.findElement(By.id("continue")).click();

		 
		 driver.findElement(By.id("ap_password")).sendKeys("54321");
		 
		 driver.findElement(By.id("signInSubmit")).click();
		 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst=new File("F:\\Software\\ScreenShots\\abc.jpg");
		FileHandler.copy(src, dst);
		
		driver.navigate().back();
		
		

		 
		 
		 
	}

}
