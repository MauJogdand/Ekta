package waitAndsynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitStudy {

	public static void main(String[] args) throws Exception {

    WebDriver driver= new ChromeDriver();
    driver.get("https://vctcpune.com/");
    Thread.sleep(3000);

    
    driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();
    
    Thread.sleep(3000);
    
    JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	 js.executeScript("window.scrollBy(0,1200)");
    
    WebElement viewCourseButton = driver.findElement(By.xpath("(//a[text()='View Courses'][@class='btn btn-primary'])[2]"));
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
	
	wait.until(ExpectedConditions.visibilityOf(viewCourseButton));
	
	System.out.println("SuccessFully Done");
	}

}
