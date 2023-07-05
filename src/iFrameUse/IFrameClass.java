package iFrameUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameClass {

	public static void main(String[] args) throws Exception {

    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    driver.switchTo().frame("frm1");
   WebElement drpdwn = driver.findElement(By.id("selectnav1"));
   Thread.sleep(2000);
   Select sdrpdwn= new Select(drpdwn);
   sdrpdwn.selectByVisibleText("-- Automation Testing");
   
   driver.switchTo().defaultContent();
   Thread.sleep(2000);
   driver.switchTo().frame("frm3");
   
   driver.switchTo().frame("frm1");
   WebElement drpdwn1 = driver.findElement(By.id("selectnav1"));
   Thread.sleep(2000);
   Select sdrpdwn1= new Select(drpdwn1);
   sdrpdwn1.selectByVisibleText("-- Automation Testing");
   
  driver.switchTo().defaultContent();
  
  driver.switchTo().frame("frm2");
  WebElement menu = driver.findElement(By.id("selectnav2"));
  Select smenu= new Select(menu);
  smenu.selectByVisibleText("Home");
   
   
	}

}
