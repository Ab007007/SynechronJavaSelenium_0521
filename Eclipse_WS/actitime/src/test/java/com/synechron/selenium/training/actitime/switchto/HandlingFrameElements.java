package com.synechron.selenium.training.actitime.switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrameElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'default')]")));
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement destElement = driver.findElement(By.id("droppable"));
		System.out.println("Before Drag and Drop");
		System.out.println("source Element : " + srcElement.getText());
		System.out.println("Dest Element : " + destElement.getText());
		System.out.println("--------------------------------------------");
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, destElement).perform();
		
		System.out.println("After Drag and Drop");
		System.out.println("source Element : " + srcElement.getText());
		System.out.println("Dest Element : " + destElement.getText());
		System.out.println("--------------------------------------------");
	
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
		
	}
}
