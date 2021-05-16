package com.synechron.selenium.training.actitime.switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		
		driver.findElement(By.xpath("//button[contains(text(),'Open alert')]")).click();
		Thread.sleep(2000);
		String msg = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println("Text on the alert : " + msg);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
}
