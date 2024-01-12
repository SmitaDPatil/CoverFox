package testNGxmlUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass3 {
	
	 @Test(groups = "Sanity")
	  public void Tc5() 
	  {
		  Reporter.log("TC5 is running",true);
	  }
	  
	  @Test(groups = {"Sanity","Regression"})
	  public void Tc6() 
	  {
		  Reporter.log("TC6 is running",true);
	  }
	  
	  @Test(groups = "Regression")
	  public void Tc7() 
	  {
		  Reporter.log("TC7 is running",true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void Tc8() 
	  {
		  Reporter.log("TC8 is running",true);
	  }
	  
}
