package handleindo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		System.out.println("parent id is" +parent);
		
		Set<String> allWindow=driver.getWindowHandles();
		
		int count = allWindow.size();
		System.out.println("total window " +count);
		
		for(String child:allWindow)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("child window handles" +driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println("parent window handle is " +driver.getTitle());
		
		
		
		
		
		

	}

}
