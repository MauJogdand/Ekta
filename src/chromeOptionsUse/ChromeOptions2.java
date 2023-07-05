package chromeOptionsUse;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions2 {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		
          List<String> l= new ArrayList<>();
          l.add("start-maximized");
          l.add("incognito");
          l.add("disable-infobars");
          //l.add("headless");
          
          co.addArguments(l);
          
          
          WebDriver driver = new ChromeDriver(co);
          
          driver.get("https://www.facebook.com");
	}

}
