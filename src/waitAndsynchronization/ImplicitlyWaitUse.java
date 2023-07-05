package waitAndsynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitUse {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		//implicit wait
		//Applicable: complete webpage
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		//80--ms-->920ms release
		
		WebElement signInButton = driver.findElement(By.xpath("(//h6[contains(text(),'Sign In')])[2]"));

		signInButton.click();
	}

}
