package com.synechron.selenium.training.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.training.actitime.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerUsingFunction 
{

	
	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = ActitimeUtils.getDriver("edge");
			
			ActitimeUtils.launch("http://localhost/login.do");
			ActitimeUtils.login("admin", "manager");
			ActitimeUtils.clickOnModule("tasks");
			ActitimeUtils.clickOnNewCustomer();
			ActitimeUtils.createCustomer("Second Customer", "Second Customer Desc");
			ActitimeUtils.logut();
	
			
	}
}
