package com.synechron.selenium.training.actitime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.selenium.training.actitime.utils.ActitimeFileUtils;
import com.synechron.selenium.training.actitime.utils.ActitimeUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerUsingExternalData {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		String url = ActitimeFileUtils.getPropertyValue("url");
		String un = ActitimeFileUtils.getPropertyValue("username");
		String pwd = ActitimeFileUtils.getPropertyValue("password");
		String br = ActitimeFileUtils.getPropertyValue("browser");
		String cn,cd, customerDataSheet = "createcustomer";

		WebDriver driver = ActitimeUtils.getDriver(br);

		ActitimeUtils.launch(url);
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.clickOnModule("tasks");
		
		int rCount = ActitimeFileUtils.rowCount(customerDataSheet);
		for (int i = 1; i < rCount ; i++)
		{
			cn = ActitimeFileUtils.getCellData(customerDataSheet, i, 0);
			cd = ActitimeFileUtils.getCellData(customerDataSheet, i, 1);
			ActitimeUtils.clickOnNewCustomer();
			ActitimeUtils.createCustomer(cn,cd);
			
		}
		ActitimeUtils.logut();

	}
}
