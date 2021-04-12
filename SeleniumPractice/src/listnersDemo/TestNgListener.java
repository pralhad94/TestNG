package listnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNgListener extends TestListenerAdapter {
	
	public void OnTestFailure(ITestResult result)
	{
		System.out.println("TestCases Failed and deatils are " +result.getName());
	}
	
	public void OnTestSkipped(ITestResult result)
	{
		System.out.println("TestCases Skipped and deatils are " +result.getName());
	}
	
	public void OnTestStart(ITestResult result)
	{
		System.out.println("TestCases Started and deatils are " +result.getName());
	}
	

	public void OnTestSuccess(ITestResult result)
	{
		System.out.println("TestCases Success hurry and deatils are " +result.getName());
	}

}
