package com.synechron.selenium.training.actitime.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOperationsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		System.out.println("Current URL : " + driver.getCurrentUrl());

		System.out.println("Window ID : " + driver.getWindowHandle());
		
		System.out.println("Title of the Page : " + driver.getTitle());
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.redbus.in/");
		
		
	}
}
