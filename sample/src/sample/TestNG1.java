package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
WebDriver driver;
	
	
	@Test (groups = {"MyTest"})
	public void FBtitleTest6()
	{
		System.out.println(" required print 6");
	}
	
	
	@Test
	public void FBtitleTest7()
	{
		System.out.println("print 7");
	}
	
	
	@Test
	public void FBtitleTest8()
	{
		System.out.println("print 8");
	}
	
	@Test
	public void FBtitleTest9()
	{
		System.out.println("print 9");
	}
	
	
	@Test (groups = {"MyTest"})
	public void FBtitleTest10()
	{
		System.out.println(" required print 10");
	}
	
	

}
