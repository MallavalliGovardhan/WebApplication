package com.CapturingTitile;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Google 
{

	public static void main(String[] args)
	{
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver .get("http://google.com");
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
			
	}

}
