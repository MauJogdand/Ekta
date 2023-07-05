package testNGstudy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExample2 {
	@Test
	public void login () {
		System.out.println("This is login Page");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class"); 
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void nameValidation()
	{
		System.out.println("nameValidation");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");}

}
