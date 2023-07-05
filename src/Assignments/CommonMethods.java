package Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	
	public static void captureScreenShot(WebDriver driver,String fileName) throws Exception
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("F:\\Software\\ScreenShots\\"+fileName+".png");
		FileHandler.copy(src, dst);
	}
	
	public static void scrollMethod(WebDriver driver, WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	public static String readingExcelsheet(String ExcelFile,int rowNum,int columnNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\Software\\ScreenShots\\ExcelSheets\\"+ExcelFile+".xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(rowNum).getCell(columnNum).getStringCellValue();
		return value;
	}
	
	public static void implicitWait(WebDriver driver,long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
}
