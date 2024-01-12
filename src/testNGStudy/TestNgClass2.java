package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2 {
  @Test
  public void myMethod()
  {
	  System.out.println("HI this is printing statement");
	  Reporter.log("HI this is Reporter,without boolean parameter");
	  Reporter.log("HI this is Reporter,with boolean parameter", true);//Everytime use
  }
}
