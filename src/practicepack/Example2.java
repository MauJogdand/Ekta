package practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
      
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'dialog-close')]")).click();

		driver.findElement(By.xpath("(//span[text()='Blog'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'dialog-close')]")).click();
		

	}

}
