package crossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserUse {

	public static void main(String[] args) {


		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
	}

}
