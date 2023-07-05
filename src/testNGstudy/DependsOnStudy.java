package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnStudy {
	@Test
	public void a() {
		Reporter.log("a is running", true);
	}
	@Test(dependsOnMethods= "a",priority = 2)
	public void b() {
		Reporter.log("b is running", true);
	}@Test(priority=3)
	public void c() {
		Reporter.log("c is running", true);
	}@Test
	public void d() {
		Reporter.log("d is running", true);
	}
}
