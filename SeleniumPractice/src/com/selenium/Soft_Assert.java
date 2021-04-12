package com.selenium;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void TestSoft()
	{
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 Started");
		assertion.assertEquals(12, 13,"number not matched");
		System.out.println("Test 2 completed");
		
		
	}
	
	public void TestHardAssert()
	{
		System.out.println("test 2 started");
		Assert.assertEquals(12, 13);
		System.out.println("test 2 completed");
	}
	
	
	
	
	

}
