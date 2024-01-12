package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDataProvider {
  
  
	  //method--> data Provider
	  //String firstName,String lastName,String MobNum
	  
	  @DataProvider(name="FBRegression")
	  
	  public static String [][]fbDataSet()
	  {
	  
	String  data[][]= {{"Smita","Patil","7227999493"},{"Sita","Patil","8888899493"},{"Raj","Patil","9876543393"}};
	  
	  return data ;
	  
  }
	  
	  @DataProvider(name="FBSanity")
	  
	  public static String[][]fbDataSet1()
	  
	  {
		  String data[][]={{"ABC","XYZ","7200000493"},{"PQR","LMN","8886767673"},{"CBZ","WER","9874444444"}};
		  
		  return data;
	  }
}

