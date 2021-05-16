package com.synechron.selenium.training.actitime.popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synechron.selenium.training.actitime.utils.ActitimeUtils;

public class FileDownloadPopUp {

	public static void main(String[] args) throws IOException {
	
		Runtime.getRuntime().exec("D:\\SynechronJavaSelenium_07_05\\autoit\\fileupload_chrome.exe");
		
		WebDriver driver = ActitimeUtils.getDriver("edge");

		ActitimeUtils.launch("https://formy-project.herokuapp.com/fileupload	");

		driver.findElement(By.xpath("//button[contains(text(),'Choose')]")).click();

	}
}
