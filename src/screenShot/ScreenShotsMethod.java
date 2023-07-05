package screenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotsMethod {

	public static void main(String[] args) throws IOException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    String random=RandomString.make(3);
    
    File dest=new File("F:\\Software\\ScreenShots\\ScrSht"+random+".png");
    
    FileHandler.copy(src, dest);
    
	}
}
