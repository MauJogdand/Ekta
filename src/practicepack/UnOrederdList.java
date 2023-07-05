package practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrederdList {

	public static void main(String[] args) {


		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("honda ");
		  List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='erkvQe']"));
		  for(WebElement sr:searchResults) {
			  System.out.println(sr.getText());
		  }
		  
		  for(WebElement sr:searchResults) {
			  
			  String test="honda amaze";
			  if(test.equals(sr.getText())) {
				  sr.click();
				  break;
				  
				  
			  }
		  }
		  
	}

}
