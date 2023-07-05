package webTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		Thread.sleep(2000);

		for(int i=1; i<5;i++) 
		{
			WebElement trow = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//th["+i+"]"));
			System.out.print(trow.getText()+" || ");

		}
		System.out.println();
		for(int j=1;j<27;j++) {
			for(int i=1; i<5;i++) 
			{
				WebElement trow = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+j+"]//td["+i+"]"));
				System.out.print(trow.getText()+" || ");

			}
			System.out.println();
		}
	}
}
