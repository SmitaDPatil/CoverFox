package coverFoxWithDataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import misc.CommanlyUsedMethod;

public class CF_TC555_Validate_search_results_for_healthcare_policies2_UsingCommandMethod
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");//popup handle
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHomePage1 home=new CoverFoxHomePage1(driver);
		 Thread.sleep(500);
		 home.clickonMaleButton();
		 
		 CoverFoxHealthPlanPage1 healthPlan=new CoverFoxHealthPlanPage1(driver);
		 Thread.sleep(500);
		 healthPlan.clickOnNextButton();
		 
		 CoverFoxMemberDetailsPage1 membersDetails=new CoverFoxMemberDetailsPage1(driver);
		 Thread.sleep(1000);
		 membersDetails.handleAgeDropDown(CommanlyUsedMethod.readDataFromExcel("CoverFoxData",0, 0));
		 Thread.sleep(1500);
		 membersDetails.clickonNextButton();
		 
		 CoverFoxAddressDetailsPage1 addressDetails=new CoverFoxAddressDetailsPage1(driver);
		 Thread.sleep(1500);
		 addressDetails.enterPinCode(CommanlyUsedMethod.readDataFromExcel("CoverFoxData",0, 1));
		 Thread.sleep(1500);
		 addressDetails.enterMobNum(CommanlyUsedMethod.readDataFromExcel("CoverFoxData",0, 2));
		 Thread.sleep(1500);
		 addressDetails.clickOnContinueButton();
		 
		 CoverFoxHealthPlanResultsPage1 planResult=new CoverFoxHealthPlanResultsPage1(driver);
		 Thread.sleep(7000);
		 planResult.validatePlanListWithResults();
		 Thread.sleep(3000);
		//driver.close();//Socket exception
		 
		
		
	}
}
