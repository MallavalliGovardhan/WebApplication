package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	@BeforeTest
	public void FirefoxBrowserLuanchAndNavigateToGmail()
	{
		System.out.println("Gmail Launched and LogIn");
	}
	@Test(priority=0)
	public void Inbox()
	{
		System.out.println("Inbox Functionality Testing");
	}
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("ComposeMail Functionality Testing");
	}
	@AfterTest
	public void Application()
	{
		System.out.println("Gmail Application Close");
	}
	
}
