package com.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LoginTestAnnotattions 
{
		FirefoxDriver driver;
		@BeforeTest
		public void Setup()
		{
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		@Test
		public void LogIn()
		{
			//<input type="text" size="10" name="userName">
			driver.findElement(By.name("userName")).sendKeys("tutorial");
			//<input type="password" size="10" name="password">
			driver.findElementByName("password").sendKeys("tutorial");
			// value="Login" name="login">
			 WebElement sigIn=driver.findElement(By.name("login"));
			 sigIn.click();
			 
			 String expected_Title= "Find";
			 String actual_Title=driver.getTitle();
			 
			 if(actual_Title.contains(expected_Title))
			 {
				 System.out.println("Title Matched--LogIn Successfully--PASS");
			 }
			 else
			 {
				 System.out.println("Title Not Matched--LogIn Failed---FAIL");
			 }
			
		}
		@AfterTest
		public void tearDown()
		{
			driver.close();
		}
}