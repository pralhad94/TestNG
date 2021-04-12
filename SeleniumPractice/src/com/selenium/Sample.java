package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver//chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.quit();
		
		driver.navigate().to("https://www.google.com/");
	}

}
