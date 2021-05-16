package testng.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	
	@FindBy(id = "username")
	WebElement usernameTxtBox;
		
	@FindBy(name = "pwd")
	WebElement pwdTxtBox;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	@FindBy(className = "errormsg")
	WebElement errorMsg;
	
	public void validateErrorMsg()
	{
		if(errorMsg.isDisplayed())
		{
			System.out.println("Invalid login : " + errorMsg.getText());
			Assert.assertTrue(errorMsg.isDisplayed());
		}
		
	}
	
	
	
	
	public void login(String un, String pwd) 
	{
		usernameTxtBox.sendKeys(un);
		pwdTxtBox.sendKeys(pwd);
		loginButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
