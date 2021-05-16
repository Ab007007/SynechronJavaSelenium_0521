package com.synechron.selenium.training.actitime.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils {

	public static void launch(String url) {
		System.out.println("launching the applcation " + url);
		driver.get(url);
	}

	public static void login(String un, String pw) {
		System.out.println("Login to the application with " + un + " and " + pw);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void clickOnModule(String moduleName) {
		System.out.println("Click on module " + moduleName);
		driver.findElement(By.xpath("//div[text()='" + moduleName.toUpperCase() + "']/parent::a")).click();

	}

	public static void clickOnNewCustomer() {
		System.out.println("Clicking on new customer Button");
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();

	}

	public static void createCustomer(String cn, String cd) {
		System.out.println("Creating Customer with " + cn  + " and " + cd);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		validateSuccessMsg();
	}

	public static void validateSuccessMsg() {

		System.out.println("--Waiting for the success message to appear --");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement msg = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));

		System.out.println("Success message " + msg.getText());

		System.out.println("--Waiting for the success message to disappear --");
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		System.out.println("Success message is disappeared successfully");
	}
	
	public static void logut()
	{
		System.out.println("--- Logout of the application---");
		driver.findElement(By.id("logoutLink")).click();
	}

}
