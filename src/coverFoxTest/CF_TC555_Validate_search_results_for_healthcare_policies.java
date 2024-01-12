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
import coverFoxUsingTestNg.CoverFoxAddressDetailsPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanResultsPage;
import coverFoxUsingTestNg.CoverFoxHomePage;
import coverFoxUsingTestNg.CoverFoxMemberDetailsPage;
import coverFoxUtility.Utility;

public class CF_TC555_Validate_search_results_for_healthcare_policies extends Base {
	
	//WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxHealthPlanResultsPage result;
@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
	    launchCoverFox();
		// driver=new ChromeDriver();
		 home=new CoverFoxHomePage(driver);
		 healthPlan=new CoverFoxHealthPlanPage(driver);
		 memberDetails=new CoverFoxMemberDetailsPage(driver);
		 addressDetails=new CoverFoxAddressDetailsPage(driver);
		 result=new CoverFoxHealthPlanResultsPage(driver);
		 
//		 Reporter.log("Opening browser",true);
//		 driver.get("https://www.coverfox.com/");
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		 Thread.sleep(1000);
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
		 
		Reporter.log("Entering pin code", true);
		addressDetails.enterPinCode(Utility.readDataFromExcel(1, 1));
		Thread.sleep(1000);
		Reporter.log("Entering mobile num", true);
		addressDetails.enterMobNum(Utility.readDataFromExcel(1, 2)); 
		Thread.sleep(1000);
		Reporter.log("clicking on continue button", true);
		addressDetails.clickOnContinueButton();
		Thread.sleep(1000);
		
	}
	@Test
	public void validateTestPlanFromTextAndBanners() throws InterruptedException, IOException
	
	{
		Thread.sleep(5000);
		Reporter.log("fetching number of result from text", true);
		int textResult=result.availablePlanNumberFromText();
		Thread.sleep(7000);
		Reporter.log("fetching number of result from Banners", true);
		int bannerResult=result.availablePlanNumberFromBanners(); 
		Thread.sleep(1000);
		Assert.assertEquals(textResult, bannerResult, "Text result are not matching with banner result, TC is failed");
		
		Thread.sleep(2000);
		Reporter.log("TC is passed", true);
		Utility.takeScreenShot(driver, "CF_TC555");
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		
		Thread.sleep(7000);
	    closeCoverFox();
	}
 
}
