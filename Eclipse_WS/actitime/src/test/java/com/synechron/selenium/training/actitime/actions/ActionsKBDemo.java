package com.synechron.selenium.training.actitime.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsKBDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("http://localhost/login.do");
		
		Actions act  = new Actions(driver);
		act.sendKeys("admin1").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager1").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
