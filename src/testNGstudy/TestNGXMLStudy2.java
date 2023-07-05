package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

//import dev.failsafe.internal.util.Assert;

public class TestNGXMLStudy2 {
	@Test
	public void myMethod7()
	{
	Reporter.log("myMethod7 is running..", true);
	}

	@Test(groups= "Smoke")

	public void myMethod8()
	{
	Reporter.log("myMethod8 is running..", true);
	}

	@Test(groups= "Smoke")

	public void myMetho9()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	Reporter.log("myMethod9 is running..", true);
	//Assert.fail("Test 9 Failed due to some reason");
	
	}

	@Test(groups= "Snaity")

	public void myMethod10()
	{
		
	Reporter.log("myMethod10 is running..", true);
	Assert.fail("Test 10 Failed due to some reason");
	}
	@Test(groups= "Snaity")


	public void myMethod11()
	{
	Reporter.log("myMethod11 is running..", true);
	}
	@Test(groups= "Snaity")

	public void myMethod12()
	{
	Reporter.log("myMethod12 is running..", true);
	}
}
