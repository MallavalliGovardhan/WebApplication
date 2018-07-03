package com.NavigateToUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Gmail 
{

	public static void main(String[] args) 
	{
		FirefoxDriver hello = new FirefoxDriver();
		hello.manage().window().maximize();
		hello.get("http://www.Gmail.com");
		
		//hello.close();
		
	}

}
