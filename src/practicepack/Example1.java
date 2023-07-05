package practicepack;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("Hello");

		driver.findElement(By.id("password")).sendKeys("Hi");

		driver.findElement(By.id("login-button")).click();

		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		String random = RandomString.make(3);
		
		File dst= new File("F:\\Software\\ScreenShots\\Practice"+random+".jpeg");

		FileHandler.copy(scr, dst);
		
		

	}

}
