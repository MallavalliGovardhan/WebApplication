package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <input type="text" size="10" name="userName">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" size="10" name="password">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// <input width="58" type="image" height="17" border="0" alt="Sign-In" src="/images/btn_signin.gif?osCsid=30a36013fc13649db386e434310a3929" 
		// value="Login" name="login">
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		String actual_Title=driver.getTitle();
		
System.out.println(expected_Title+"-Client expected Title information");
System.out.println(actual_Title+"  -  Developer Provided Title");
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successful -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FIAL");
		}
		
		driver.close();
		

	}

}
