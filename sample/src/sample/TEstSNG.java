package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TEstSNG {
	
	WebDriver driver;
	
	
	@Test  (threadPoolSize = 4,invocationCount = 8,timeOut = 1000)
	public void FBtitleTest1()
	{
		System.out.println(" required print 1 |" +Thread.currentThread().getId());
	}
	
	
	@Test
	public void FBtitleTest2()
	{
		System.out.println("print 2 |" +Thread.currentThread().getId());
	}
	
	
	@Test // (groups = {"MyTest"})
	public void FBtitleTest3()
	{
		System.out.println("required print 3 |" +Thread.currentThread().getId());
	}
	
	@Test 
	public void FBtitleTest4()
	{
		System.out.println("print 4 |" +Thread.currentThread().getId());
	}
	
	
	@Test //(groups = {"MyTest"})
	public void FBtitleTest5()
	{
		System.out.println("required print 5 |" +Thread.currentThread().getId());
	}
	
	
	
	
	
}
