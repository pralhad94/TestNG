package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWIthOKandCancelButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver//chrome.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.get("shdbhs");
		
		// alert with ok cancel button link
		driver.findElement(By.xpath("sdg")).click();
        // alert with ok cancel button
		driver.findElement(By.xpath("sdf")).click();
		
		String expTextOK = "You Pressed OK";
		String expTextCancel = " you Pressed Cancel";
		
		driver.switchTo().alert().accept();
		
		String actText = driver.findElement(By.xpath("hbwfbd")).getText();
		
		if (expTextOK.equals(actText)== true) 
		{
			System.out.println(" test is passed ");
		}
		
		driver.findElement(By.xpath("sdf")).click();
		
		driver.switchTo().alert().dismiss();
		if(expTextCancel.equals(actText)==true)
		{
			System.out.println(" test is passed ");
		}
		
		// if we want pass pass message in alert box
		
		driver.switchTo().alert().sendKeys("snf");
		
		
		
		
		
		
	}

}
