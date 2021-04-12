package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver//chrome.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.get("sdfb");
		// alert box with ok button example
		// alert with ok link
		driver.findElement(By.xpath("xxxx")).click();
		
		// alert with ok button
		driver.findElement(By.xpath("zxxx")).click();
		// which ever text present in alert it will returm
		System.out.println(driver.switchTo().alert().getText());
		// switch to alert box
		driver.switchTo().alert().accept(); // it will point to that alert after that it will accept means it will click ok button 
		
		
	}

}
