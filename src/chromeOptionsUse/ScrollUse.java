package chromeOptionsUse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollUse {

	public static void main(String[] args) {
     
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	 js.executeScript("window.scrollBy(0,200)");
	 //js.executeAsyncScript(argument, args)
	}

}
