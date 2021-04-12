package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver//chrome.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.get("shdbhs");
		
		driver.findElement(By.xpath("ge")).click();
		
		// 1st time click
		driver.findElement(By.xpath("ge")).click();
		
		driver.switchTo().alert().sendKeys(" some test");
		driver.switchTo().alert().accept();
		
		String EXpString = " some text";
		
		String actSTring = driver.findElement(By.xpath("sbbfwf")).getText();
		
		if (EXpString.equals(actSTring)==true) 
		{
			System.out.println(" test is passed ");
		}
		
		// 2nd time click
		
		driver.findElement(By.xpath("ge")).click();
		driver.switchTo().alert();
		
		
		
		
		
		
		
		
		
		
	}

}
