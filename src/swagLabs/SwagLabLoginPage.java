package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 

{
	
	//1.variable-->WebElements
	
	@FindBy(name = "user-name")private WebElement userNameFiled;
	@FindBy(id = "password")private  WebElement passwordfiled;
	@FindBy(xpath =" //input[@class='submit-button btn_action']")private WebElement loginButton;
	
	//2.Constructor
	
	public SwagLabLoginPage(WebDriver driver)
	
	{
		PageFactory.initElements( driver,this);
	}
	
	//3.Methods
	
	public void enterUserName()
	
	{
		userNameFiled.sendKeys("standard_user");
		
	}
	public void enterpassword()
	{
		passwordfiled.sendKeys("secret_sauce");
	}
	public void clickOnLoginButton()
	
	{
		loginButton.click();
		
	}

}
