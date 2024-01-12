package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

//run methods (include/exclude) from multiple classes
public class MyClass2 {
  @Test
  public void Tc5() 
  {
	  Reporter.log("TC5 is running",true);
  }
  
  @Test
  public void Tc6() 
  {
	  Reporter.log("TC6 is running",true);
  }
  
  @Test
  public void Tc7() 
  {
	  Reporter.log("TC7 is running",true);
  }
  
  @Test
  public void Tc8() 
  {
	  Reporter.log("TC8 is running",true);
  }
  
}
