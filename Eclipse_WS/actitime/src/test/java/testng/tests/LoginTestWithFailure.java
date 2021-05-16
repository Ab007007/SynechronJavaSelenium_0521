package testng.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testng.page.DashBoardPage;
import testng.page.LoginPage;

public class LoginTestWithFailure {
	
	WebDriver driver = null;
	LoginPage lp = null;
	DashBoardPage dp = null;
	
	@BeforeTest
	public void createDriver()
	{
		Reporter.log("--Creating a webDriver object----<br>");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void getRequiredPages()
	{
		Reporter.log("--Creating a PageClass object----<br>");
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
	}
	
	@BeforeMethod
	public void launch()
	{
		Reporter.log("--Launcting the application----<br>");
		driver.get("http://localhost/login.do");
	}
	
	@Test(priority = 1)
	public void validLogin()
	{
		Reporter.log("--Valid login Test----<br>");
		lp.login("admin", "manager");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		dp.logout();
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}
	
	
	@Test(priority = 2)
	public void invalidLogin()
	{
		Reporter.log("--InValid login Test----<br>");
		lp.login("admin1", "manager1");
		lp.validateErrorMsg();
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}
	
	@Test(priority = 3)
	public void invalidLoginWithFail()
	{
		Reporter.log("--InValid login Test----<br>");
		lp.login("admin1", "manager1");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		dp.logout();
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}
	
	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			TakesScreenshot ss = (TakesScreenshot) driver;
			File file = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("ss/"+result.getName() + ".png"));
		}
		else
		{
			System.out.println("Test passsed " + result.getTestName());
		}
	}
	
	@AfterTest
	public void closeDriver()
	{
		Reporter.log("--Closing the browser----<br>");
	
		driver.close();
	}
	

}
