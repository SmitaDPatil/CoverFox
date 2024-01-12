package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

//how to run particular methods from class?--> Use include tag
public class MyClass {
  @Test
  public void Tc1()
  {
	  Reporter.log("TC1 is running", true);
  }
  
  @Test
  public void Tc2()
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @Test
  public void Tc3()
  {
	  Reporter.log("TC3 is running", true);
  }
  
  @Test
  public void Tc4()
  {
	  Reporter.log("TC4 is running", true);
  }
}
