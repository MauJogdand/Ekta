package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listeners.class)
public class SampleTest {
  @Test
  public void TC1() {
	  
	  Reporter.log("Test TC1 is running",true);
  }
  
  @Test()
  public void TC2() {
	  
	  Reporter.log("Test TC2 is running",true);
  } 
  @Test
  public void TC3() {
	  
	  Reporter.log("Test TC3 is running",true);
	  Assert.fail();

  }  
  @Test
  public void TC4() {
	  
	  Reporter.log("Test TC4 is running",true);
  }
}
