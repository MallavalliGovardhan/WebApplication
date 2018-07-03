package com.KeyWords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		 driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void Login() throws IOException, InterruptedException
	{
		FileInputStream file = new FileInputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\NewToursLogIn.properties");
		Properties pr = new Properties();
				pr.load(file);
				driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
				driver.findElement(By.name(pr.getProperty("PassWord"))).sendKeys("tutorial");
				driver.findElement(By.name(pr.getProperty("SignIn"))).click();
				String expected_Title="search";
				Thread.sleep(2000);
				String actual_Title= driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font").getText();
				if(actual_Title.contains(expected_Title))
				{
					System.out.println("LogIn Successfully---PASS");
				}
				else
				{
					System.out.println("LogIn Failed---FAIL");
				}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
