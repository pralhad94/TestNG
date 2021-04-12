package com.screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		takeScreenshot("Facebook_LoginPage");
		

	}
	
	public static void takeScreenshot(String fileName)  {
		// 1. take screenshot and store as a file format:
		// takeScreenShot is an interface we have convert driver to takesScreenshot interface
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// we want output in file type
		
		// 2. now copy the screenshot to desired location using copyfile method:
		FileUtils.copyFile(file, new File("C:\\Users\\admin\\git\\TestNG\\SeleniumPractice"+fileName+".jpg"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
