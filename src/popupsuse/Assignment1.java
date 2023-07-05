package popupsuse;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();

		
		Set<String> wndhndl = driver.getWindowHandles();
	    ArrayList<String> arr=new ArrayList<>(wndhndl);
	    
	    driver.switchTo().window(arr.get(1));
	    
	    driver.findElement(By.name("emailid")).sendKeys("Hello");
	    
	    driver.close();
	    driver.switchTo().window(arr.get(0));
	    String textmain = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();

	    System.out.println(textmain);
	    
	    

	}

}
