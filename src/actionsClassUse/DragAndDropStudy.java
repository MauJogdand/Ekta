package actionsClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws Exception {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		//1.
		Actions act= new Actions(driver);

		WebElement source = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));

		WebElement dst = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//act.dragAndDrop(source,dst).perform();


		act.clickAndHold(source).moveToElement(dst).release().build().perform();
	}

}
