package com.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_ALL_Annotationa {
	
	@BeforeSuite(enabled=true)
	public void test1()
	{
		System.out.println("I am in before suite");
	}
	
	@BeforeTest
	public void test2()
	{
		System.out.println("I am in before test");
	}
	
	@BeforeClass
	public void test3()
	{
		System.out.println("I am in before Class");
	}
	
	@BeforeMethod
	public void test4()
	{
		System.out.println("I am in before method");
	}
	
	@Test
	public void test5()
	{
		System.out.println("I am in Test");
	}
	
	@AfterMethod
	public void test6()
	{
		System.out.println("I am in after method");
	}
	
	@AfterClass
	public void test7()
	{
		System.out.println("I am in after class");
	}
	
	
	@AfterTest
	public void test8()
	{
		System.out.println("I am in after test");
	}
	
	@AfterSuite
	public void test9()
	{
		System.out.println("I am in after suite");
	}

}
