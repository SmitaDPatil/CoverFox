package testNGxmlUse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass4 {
	 @Test
	  public void Tc1()
	  {
		  Reporter.log("TC1 is running", true);
	  }
	  
	  @Test
	  public void Tc2()
	  {
		 // Assert.fail();
		  Reporter.log("TC2 is running", true);
	  }
	  
	  @Test
	  public void Tc3()
	  {
		// Assert.fail();
		  Reporter.log("TC3 is running", true);
	  }
	  
	  @Test
	  public void Tc4()
	  {
		// Assert.fail();
		  Reporter.log("TC4 is running", true);
	  }
	  
	  @Test
	  public void Tc5()
	  {
		// Assert.fail();
		  Reporter.log("TC5 is running", true);
	  }
}
