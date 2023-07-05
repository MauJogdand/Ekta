package dropDownMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select sdate=new Select(day);

		sdate.selectByValue("14");

		WebElement month = driver.findElement(By.id("month"));

		Select smonth=new Select(month);
		smonth.selectByIndex(4);

		WebElement year = driver.findElement(By.id("year"));

		Select syear=new Select(year);

		syear.selectByValue("2016");





	}

}
