package a2UtilityPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	//wait 
	public static void wait(WebDriver driver, long time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

	//screenShot
	public static void captureScreenShot(WebDriver driver, String fileName) throws IOException {

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest= new File("F:\\Software\\ScreenShots\\Project3ScreenShots\\"+fileName+".png");

		FileHandler.copy(src, dest);
	}

	//Scrolling
	public static void scrollInToElement(WebDriver driver, WebElement element) {

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
	}

	//ExcelSheetReading
	public static String excelread(int row, int col) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("F:\\Software\\ScreenShots\\ExcelSheets\\Amazon_Excel.xlsx");
		String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();

		return value;
	}

	//Explicit Wait
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		return driver.findElement(locator);
	}

	//for BootStrap DropDown

	public static void selectOptionFromDropDown(List<WebElement> options, String value) {

		for(WebElement opt:options) {
			if(opt.getText().equals(value)) {
				opt.click();
				break;
			}
		}
	}

	//reading data from property file
	public static String readFromProperty(String key) throws IOException {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Atul\\eclipse-workspace1\\MySeleniumProject3\\myProperty.properties");
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

}











