package com.tyss.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreysAnatomyPoll {
	WebDriver driver;
@BeforeMethod
public void bm()
{
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.justjared.com/2019/09/02/which-greys-anatomy-star-do-you-want-to-return-in-season-16-vote-now/");
}

@Test
public void poll()
{
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
	
	driver.findElement(By.xpath("//span[text()='Izzie Stevens (Katherine Heigl)']/parent::label/preceding-sibling::span/input")).click();
	driver.findElement(By.xpath("//a[@id='pd-vote-button10398423']")).click();
	driver.findElement(By.xpath("//a[@class='pds-return-poll']")).click();
}

@AfterMethod
public void am()
{
	driver.close();
}



}
