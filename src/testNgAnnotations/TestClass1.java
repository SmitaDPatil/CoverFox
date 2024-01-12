package testNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void TC1()
  
  {
	  Reporter.log("Running TC1", true);
  }
  
  @Test
 public void TC2()
  
  {
	  Reporter.log("Running TC2", true);
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("Before method is Running",true);
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After method is Running",true);
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Before class is Running",true);
  }
  
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("After class is Running",true);
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("BeforeSuite is Running",true);
  }
  
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("AfterSuite is Running",true);
  }
  
  
}
