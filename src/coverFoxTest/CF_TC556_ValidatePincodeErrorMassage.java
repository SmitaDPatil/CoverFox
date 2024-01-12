package coverFoxTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage;
//import coverFoxUsingTestNg.CoverFoxAddressDetailsPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanResultsPage;
import coverFoxUsingTestNg.CoverFoxHomePage;
import coverFoxUsingTestNg.CoverFoxMemberDetailsPage;
import coverFoxUtility.Utility;

public class CF_TC556_ValidatePincodeErrorMassage extends Base {
	
	//WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	
@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
	    launchCoverFox();
		// driver=new ChromeDriver();
		 home=new CoverFoxHomePage(driver);
		 healthPlan=new CoverFoxHealthPlanPage(driver);
		 memberDetails=new CoverFoxMemberDetailsPage(driver);
		 addressDetails=new CoverFoxAddressDetailsPage(driver);
		 
		 

	}
	@BeforeMethod
	
	public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("clicking on gender button", true);
		home.clickonMaleButton();
		Thread.sleep(1000);
		
		
		Reporter.log("clicking on next button", true);
		healthPlan.clickOnNextButton();	
		Thread.sleep(1000);
		
		Reporter.log("Handling age drop down", true);
		memberDetails.handleAgeDropDown(Utility.readDataFromExcel(1, 0));
		Thread.sleep(1000);
		Reporter.log("clicking on next button", true);
		memberDetails.clickonNextButton();
		Thread.sleep(1000);
		 
		
		Reporter.log("Entering mobile num", true);
		addressDetails.enterMobNum(Utility.readDataFromExcel(1, 2)); 
		Thread.sleep(1000);
		Reporter.log("clicking on continue button", true);
		addressDetails.clickOnContinueButton();
		Thread.sleep(5000);
		
	}

	
	@Test
	public void validateErrorMassage()
	{
		boolean test1 = addressDetails.varerrorMsgElementPresency();
		Assert.assertTrue(test1,"Error massage is not avalaible , test case is failed");
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		
		Thread.sleep(7000);
	    //closeCoverFox();
	}
 
}
