package testNGassertions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void f()
  {
	  String a="Pune";
	  String b="Pune";
	  String c="Mumbai";
	  
	  //verify a and b are equal
	 // Assert.assertEquals(a, b,"A and B are not matching TC is failed");
	  
	  //verify b and c are not equal
	  
	  Assert.assertNotEquals(b, c, "B and C are equal,TC failed");
  }
}
