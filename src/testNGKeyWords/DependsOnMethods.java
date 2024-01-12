package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test
  public void payment() 
  {
	  Reporter.log("payment done", true);
  }
  
  @Test(timeOut = 30)
  public void couponCode2() throws InterruptedException 
  {
	  Thread.sleep(200);
	  Reporter.log("50% discount is done", true);
  }
  
  @Test(dependsOnMethods = {"couponCode2"})
  public void discount() 
  {
	  Reporter.log("discount is used", true);
  }
}
