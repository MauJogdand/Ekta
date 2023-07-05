package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgXMLStudy {
	@Test(groups= "Smoke")

	public void myMethod1()
	{
	Reporter.log("myMethod1 is running..", true);
	}

	@Test(groups= "Sanity")
	public void myMethod2()
	{
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.google.com/");
	Reporter.log("myMethod2 is running..", true);
	}

	@Test
	public void myMethod3()
	{
	Reporter.log("myMethod3 is running..", true);
	}

	@Test(groups= "Sanity")
	public void myMethod4()
	{
	Reporter.log("myMethod4 is running..", true);
	}
	@Test(groups= "Smoke")

	public void myMethod5()
	{
	Reporter.log("myMethod5 is running..", true);
	}
	@Test(groups= "Sanity")
	public void myMethod6()
	{
	Reporter.log("myMethod6 is running..", true);
	}
}
