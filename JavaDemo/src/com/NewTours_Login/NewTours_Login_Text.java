package com.NewTours_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Login_Text 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		//<input type="text" size="10" name="userName">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		//<input type="password" size="10" name="password">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//login
		driver.findElementByName("login").click();
		
		String expected_Title = "Find";
		String actual_Title = driver.getTitle();
		System.out.println(expected_Title+" --Client Expected Title Information");
		System.out.println(actual_Title+"--Developer Title Information");
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Login Successfull---Pass");
		}
		else
		{
			System.out.println("Login Fai----Fail");
		}
			driver.close();
	}

}
