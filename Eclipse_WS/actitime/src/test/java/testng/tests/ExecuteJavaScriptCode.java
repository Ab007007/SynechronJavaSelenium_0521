package testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.synechron.selenium.training.actitime.utils.ActitimeUtils;

public class ExecuteJavaScriptCode {

	@Test
	public void executeJs() throws InterruptedException
	{
		WebDriver driver = ActitimeUtils.getDriver("edge");

		ActitimeUtils.launch("http://formy-project.herokuapp.com/scroll");

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, 1000);");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
	}
}
