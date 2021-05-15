package com.synechron.selenium.training.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/SynechronJavaSelenium_07_05/html/multiSelect.html");
		
		Select sel = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByValue("volvo");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(3000);
		
		sel.deselectByIndex(0);
		Thread.sleep(3000);
		sel.deselectByValue("mercedes");
		Thread.sleep(3000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.selectByValue("volvo");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(3000);
	
		sel.deselectAll();
		
	}
}
