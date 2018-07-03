package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation 
{

	public static void main(String[] args) 
	
	{
		FirefoxDriver hello = new FirefoxDriver();
		
		hello.manage().window().maximize();
		hello.close();
	}

}
