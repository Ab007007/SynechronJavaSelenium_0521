package com.synechron.selenium.training.actitime.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovementOperationsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		closeButton.click();
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		WebElement appliances = driver.findElement(By.xpath("//div[text()='Appliances']"));
		WebElement btmore = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
		
		
		Actions act  = new Actions(driver);

		act.moveToElement(fashion).perform();
		Thread.sleep(2000);
		act.moveToElement(electronics).perform();
		Thread.sleep(2000);
		act.moveToElement(btmore).perform();
		Thread.sleep(2000);
		act.moveToElement(appliances).perform();
		Thread.sleep(2000);
		act.moveToElement(home).perform();
		Thread.sleep(2000);
		
		
		//act.doubleClick()
		//act.clickAndHold()
		//act.release()
		//act.contextClick()
		
	}
}
