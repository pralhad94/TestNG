package listnersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listnersDemo.TestNgListener.class)
public class MyFirstTestcase {

	
	@Test
	public void GoogleTitleVerify()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void titleMatch()
	{
		System.out.println("test 2 dummy");
		Assert.assertTrue(false);
	}
	
	
}
