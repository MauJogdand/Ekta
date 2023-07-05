package practicepack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//Create and Object of Actions Class and pass driver object as parameter
		Actions act= new Actions(driver);
		//by using action class object take required actions
		//option1 to context click
		act.contextClick(rightClickButton).perform();

		Thread.sleep(3000);

//		WebElement copyOption = driver.findElement(By.xpath("//span[text()='Copy']"));
//
//		act.moveToElement(copyOption).click().build().perform();
//		Thread.sleep(1000);
//
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
//		System.out.println(alt.getText());


		//option2 to context click
			 //act.moveToElement(rightClickButton).perform();
		 act.contextClick(doubleClickButton).perform();
		//option3 to context click
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		//double click on button
		//		act.doubleClick(doubleClickButton).perform();
		//		act.moveToElement(doubleClickButton).doubleClick().build().perform();
	}

}
