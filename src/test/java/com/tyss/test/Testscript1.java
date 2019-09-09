package com.tyss.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscript1 {
	WebDriver driver;
	@Test
	public void testcase1()
	{
		
		 driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		//driver.close();
		
	}
}
