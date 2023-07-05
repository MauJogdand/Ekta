package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TNG_Keywords {
  @Test(enabled=true)
  public void a() {
	  Reporter.log("a is running", true);  
  }
  
  @Test(dependsOnMethods = {"a","e"},priority =1)
  public void b() {
	  Reporter.log("b is running", true);
  }
  @Test(priority = -1,invocationCount = 2)
  public void d() {
	  Reporter.log("d is running", true);
  }
  @Test(timeOut = 1000,priority=-1)
  public void e() {
	  
	  Reporter.log("e is running", true);
  }



}
