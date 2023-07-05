package a1BasePack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {


	protected static WebDriver driver;

	public void launchBrowser ()

	{  
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("disable-notifications");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}

}
