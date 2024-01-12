package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class CoverFoxAddressDetailsPage

{

	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobNumField;
	@FindBy(xpath ="//div[text()='Continue']" )private WebElement continueButton;
	@FindBy(className = "error-ui") private WebElement errorMsg;
	
	public CoverFoxAddressDetailsPage (WebDriver driver)
	
	{
		PageFactory.initElements( driver ,this);
	}
	public void enterPinCode(String pincode) throws InterruptedException
	
	{
		Thread.sleep(500);
		pinCodeField.sendKeys(pincode);
	}
	
	public void enterMobNum(String mobNum) throws InterruptedException
	
	{
		Thread.sleep(500);
		mobNumField.sendKeys(mobNum);
	}
	
	public void clickOnContinueButton() throws InterruptedException
	
	{
		Thread.sleep(500);
		continueButton.click();
	}
	
	public boolean varerrorMsgElementPresency()
	{
		boolean value = errorMsg.isDisplayed();
		return value;
	}

}
