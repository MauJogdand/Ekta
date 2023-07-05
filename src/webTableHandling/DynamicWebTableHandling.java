package webTableHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//find out number of rows and columns

		int rowCount = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();

		int columnCount = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th")).size();

		//nested for loop

		//outer for loop--> row

		for(int i=1;i<=rowCount-1;i++)
		{

			for(int j=1;j<=columnCount;j++)
			{
				if(i==1)
				{
					WebElement data =

							driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//th["+j+"]"));

					System.out.print(data.getText()+" || ");
				}
				else
				{
					WebElement data =

							driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));

					System.out.print(data.getText()+" || ");
				}
			}
			System.out.println();
		}

	}
}
