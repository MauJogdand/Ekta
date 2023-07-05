package testNGstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderStudy {
  @Test(dataProvider = "dataBase")
  public void TestClass(String name, String pass) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).sendKeys(name);
	  driver.findElement(By.id("pass")).sendKeys(pass);
  }
  @DataProvider(name = "dataBase",parallel = true)
  public String[][] method1()
  {
	String[][]  value= {{"EktaKhandekar","Password1"},{"AtulKhandekar","Password2"},{"Avanya","Passwor3"}}  ;
	return value;
  }
  
}
