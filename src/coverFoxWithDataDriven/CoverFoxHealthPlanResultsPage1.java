package coverFoxWithDataDriven;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResultsPage1 

{

	@FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement resultsInString;
	@FindBy(id = "plans-list")private List<WebElement>planList;
	
	public CoverFoxHealthPlanResultsPage1(WebDriver driver) 
	{
		PageFactory.initElements( driver, this);
		
			
		}
	
	public void validatePlanListWithResults()
	{
		 
		 String test = resultsInString.getText();
		 //49 matching health insurance plan
		 
		 String ar[]=test.split(" ");
		 //ar[]={"49" "matching" "Health" "Insurance" "Plans"}
		 
		 String numberOfResultsInstring = ar[0];//49-->string
		 //convert String to integer
		 
		 int  numberOfResultsInInt= Integer.parseInt(numberOfResultsInstring);//49-->in number(int)

		 int totalNumberOfPlans= planList.size();
		 
		 System.out.println(totalNumberOfPlans);
		 
		 if (totalNumberOfPlans==numberOfResultsInInt)
		 {
			 System.out.println("Plans number matching with plans List,TC is passed");
		 }
		 else {
			 System.out.println("Plans number is not matching with plans List,TC is Failed");
		 }
		 
	}

}
