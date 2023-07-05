package chromeOptionsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsStudy {

	public static void main(String[] args) {

       ChromeOptions co=new ChromeOptions();
      // co.addArguments("start-maximized");
      // co.addArguments("incognito");
      co.addArguments("headless");
       //co.addArguments("disable-extension");
       co.addArguments("--disable-infobars");
       
       WebDriver driver = new ChromeDriver(co);
       driver.get("https://www.facebook.com");
       
       WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
       
       System.out.println(text.getText());
       
		  
	}

}
