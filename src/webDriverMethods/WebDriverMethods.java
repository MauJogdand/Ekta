package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.findElement(By.xpath("//a[text()='Create new account']")).click();
      Thread.sleep(2000);
    
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hello");
      
      WebElement FemaleButton = driver.findElement(By.xpath("//label[text()='Female']"));
      FemaleButton.click();
      System.out.println(FemaleButton.isSelected());
     boolean result = FemaleButton.isSelected();
      
      if(result==true)
      {
    	  System.out.println("Radio Button is selected now");
      }
      else {
    	  System.out.println("Radio Button is not selected");
      }
      
	}

}
