package com.ValidatingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String expected_Url="facebook.com";
		
		String actual_Url=driver.getCurrentUrl();
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println("Url matched -- Pass");
		}
		else
		{
			System.out.println("Url not matched - Fail");
		}
		
		driver.close();

	}

}
