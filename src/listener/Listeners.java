package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getName()+"is successful",true);
	}

	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getClass()+"is Failed",true);
	}
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getClass()+"is Skipped",true);
	}
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getClass()+"is Started",true);
	}
	
	
}
