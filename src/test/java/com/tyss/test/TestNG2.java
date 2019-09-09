package com.tyss.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {
	WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"})
	public void testcase1(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		}else
		{
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		 //driver.get("https://www.google.com");
	}
	
	@Test
	public void testcase2()
	{
		
		 driver.get("https://www.youtube.com");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		//driver.close();
		
	}
	
}
