package TestNGpkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test(priority=2)
  public void m1() {
	  System.out.println("method1");
  }
  @Test(priority=1)
  public void m2() {
	  System.out.println("method2");
	  
  }
  @Test(priority=3)
  public void m3() {
	  System.out.println("method3");
	  Reporter.log("TestNG framework");
  }
  
}
