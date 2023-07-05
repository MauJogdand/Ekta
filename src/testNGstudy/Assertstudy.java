package testNGstudy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertstudy {
  @Test//(priority=1)
  public void softAssert() {
	  
	 // boolean a=true;
	  boolean b=false;
	  
	  //String c="Pune";
	  String d=null;
	
	  
	  SoftAssert sa= new SoftAssert();
	  sa.assertTrue(b, "Value is false TC is failed");
	  sa.assertNotNull(d,"Value is null TC failed");
	  sa.assertNull(d,"Value is not null TC failed");
	  
	  sa.assertAll();
  }
  @Test
  public void softAssert2()
  {
	  
	  int x=10;
	  int y=10;
	  
	  SoftAssert sa= new SoftAssert();
      sa.assertNotEquals(x, y, "Values are not equal TC failed");
      sa.assertAll("All Methods are Verified");
  }
  
  @Test//(priority=2)
  public void hardAssertUse()
  {
	  String a=null;
	  String b="Automation";
	  Assert.assertNotNull(b,"Value is null TC is failed");
	  
	  Assert.assertNull(b, "Value is not null TC is failed");
  }
}
