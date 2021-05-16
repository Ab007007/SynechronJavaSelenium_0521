package com.synechron.selenium.training.actitime.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		//https://www.irctc.co.in/eticketing/errors.html#
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/errors.html#");
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it  = windowIDs.iterator();
		String parentWID = it.next();
		String childWID = it.next();
		
		System.out.println("Parent Window ID : " + parentWID);
		System.out.println("child Window ID : " + childWID);
		
		
		driver.switchTo().window(childWID);
		
		List<WebElement> emailIDs = driver.findElements(By.tagName("a"));
		
		System.out.println("Printing all the email IDs...");
		for (WebElement email : emailIDs) 
		{
			System.out.println(email.getText());
			
		}
		
		driver.close();
		
		driver.switchTo().window(parentWID);
		
		driver.findElement(By.linkText("Home")).click();
		
		if(driver.findElement(By.xpath("//span[text()='Alert']")).isDisplayed())
		{
			System.out.println("--- Navigated to New IRCTC Page----");
		}
		else
		{
			System.out.println("---Not  Navigated to New IRCTC Page----");
		}
		
		driver.close();
		
		
		
		
	}
}
