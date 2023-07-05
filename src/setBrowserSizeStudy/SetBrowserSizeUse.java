package setBrowserSizeStudy;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSizeUse {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		//org.openqa.selenium.Dimension d = driver.manage().window().getSize();
		//1050, 652--> default size
		//1. create an object of Dimension class and pass two parameters
		//1st width and 2nd height

          org.openqa.selenium.Dimension d1= new org.openqa.selenium.Dimension(400, 500);

		//2.by using setSize method we can set browser size.

         driver.manage().window().setSize(d1);
//
          driver.get("https://www.naukri.com/");
//	}

}
}