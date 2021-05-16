package com.synechron.selenium.training.actitime.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.training.actitime.utils.ActitimeFileUtils;
import com.synechron.selenium.training.actitime.utils.ActitimeUtils;

public class HiddenDivisionPopUp {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver("ff");
		
		ActitimeUtils.launch("https://formy-project.herokuapp.com/modal");
		
		driver.findElement(By.xpath("//button[contains(text(),'Open modal')]")).click();
		
		System.out.println(driver.findElement(By.id("exampleModalLabel")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']")).getText());
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("close-button"))));
		
		driver.findElement(By.id("close-button")).click();
		System.out.println("END");
	}
}
