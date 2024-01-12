package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse {
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 is running", true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @BeforeMethod
 public void beforeMethod()
 {
	  
	  Reporter.log("Before Method is running", true);
 }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after Method is running", true);
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Open browser-->Before class", true);
	  
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("Close browser-->After class", true);
  }
}
