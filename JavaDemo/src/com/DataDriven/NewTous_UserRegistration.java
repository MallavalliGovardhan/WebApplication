package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTous_UserRegistration 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	@Test(priority=0)
	public void register()
	{
		//<a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=1)
	public void newUserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Kiran");
		driver.findElement(By.name("lastName")).sendKeys("Joyee");
		driver.findElement(By.name("phone")).sendKeys("12365478");
		driver.findElement(By.id("userName")).sendKeys("Kriam@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Moosapet");
		driver.findElement(By.name("city")).sendKeys("Hyderdad");
		driver.findElement(By.name("state")).sendKeys("TS");
		driver.findElement(By.name("postalCode")).sendKeys("50018");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("krannnn1");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="Kiran";
		
		String actual_RegistedUserText=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
		
		if(actual_RegistedUserText.contains(expected_UserName))
		{
			System.out.println("User Registed Successfully---PASS");
		}
		else
		{
			System.out.println("User Registed Failed---FALL");
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
