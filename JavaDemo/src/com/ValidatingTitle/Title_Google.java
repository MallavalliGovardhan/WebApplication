package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Google 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String expected_Title="Google";
		String actual_Title = driver.getTitle();
		
		System.out.println(expected_Title+"- Client Expected Title");
		System.out.println(actual_Title+"- Developer Given Title");
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title_Matched--Pass");
		}
		else
		{
			System.out.println("Title_Not Matched--Fail");
		}
		//driver.manage().window().maximize();
		driver.close();
	}
}