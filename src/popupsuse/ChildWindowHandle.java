package popupsuse;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandle {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://skpatro.github.io/demo/links/");
    
    driver.findElement(By.name("NewWindow")).click();
    
     Set<String> windhndl = driver.getWindowHandles();
    
    
    ArrayList<String> arr=new ArrayList<>(windhndl);
    
	/*
	 * arr.get(0); arr.get(1);
	 */
    
    driver.switchTo().window(arr.get(1));
    
    System.out.println(arr.get(1));
    
    driver.findElement(By.id("the7-search")).sendKeys("Hello");
    
    Thread.sleep(2000);
    driver.close();
    
    driver.switchTo().window(arr.get(0));
    driver.findElement(By.name("NewWindow")).click();
    System.out.println(arr.get(0));

    
    
    
	}

}
