package coverFoxWithDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import coverFox.CoverFoxHealthPlanPage;


public class CF_TC555_Validate_search_results_for_healthcare_policies1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
	 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData");
		String ageData = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pinCodeData = mySheet.getRow(0).getCell(1).getStringCellValue();
		String mobNumData = mySheet.getRow(0).getCell(2).getStringCellValue();
		
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
		 membersDetails.handleAgeDropDown(ageData);
		 Thread.sleep(1500);
		 membersDetails.clickonNextButton();
		 
		 CoverFoxAddressDetailsPage1 addressDetails=new CoverFoxAddressDetailsPage1(driver);
		 Thread.sleep(1500);
		 addressDetails.enterPinCode(pinCodeData);
		 Thread.sleep(1500);
		 addressDetails.enterMobNum(mobNumData);
		 Thread.sleep(1500);
		 addressDetails.clickOnContinueButton();
		 
		 CoverFoxHealthPlanResultsPage1 planResult=new CoverFoxHealthPlanResultsPage1(driver);
		 Thread.sleep(7000);
		 planResult.validatePlanListWithResults();
		 Thread.sleep(3000);
		//driver.close();//Socket exception
		 
	}


}


