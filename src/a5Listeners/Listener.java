package a5Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import a1BasePack.Base;
import a2UtilityPack.Utility;

public class Listener extends Base implements ITestListener {
	

	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test Case "+result.getName()+" is running successfully", true);
	}
	
	 @Override
	public void onTestFailure(ITestResult result) {
		 Reporter.log("Test Case "+result.getName()+" is Failed",true);

			try {
				Utility.captureScreenShot(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
