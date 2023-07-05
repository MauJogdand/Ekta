package actionsClassUse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickUse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(1000);

		Actions act= new Actions(driver);


		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		act.contextClick(rightClickButton).perform();
		

		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();

		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

}
