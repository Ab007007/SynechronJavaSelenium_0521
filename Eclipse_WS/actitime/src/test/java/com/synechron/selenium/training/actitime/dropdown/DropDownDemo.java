package com.synechron.selenium.training.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://formy-project.herokuapp.com/dropdown");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.linkText("Radio Button")).click();
		
	}
}
