package testng.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testng.dataprovider.TestData;
import testng.page.DashBoardPage;
import testng.page.LoginPage;

public class LoginTestWithExternalData {
	
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
	
	@Parameters("url")
	@BeforeMethod
	public void launch(String url)
	{
		Reporter.log("--Launcting the application----<br>");
		driver.get(url);
	}
	
	@Test(priority = 1, dataProvider = "loginData", dataProviderClass = TestData.class)
	public void validLogin(String un, String pwd)
	{
		Reporter.log("--Valid login Test----<br>");
		lp.login(un,pwd);
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
	
	@AfterTest
	public void closeDriver()
	{
		Reporter.log("--Closing the browser----<br>");
	
		driver.close();
	}
	

}
