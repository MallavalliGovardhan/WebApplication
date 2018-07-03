package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3
{
	@BeforeMethod
	public void FirefoxBrowserLuanchAndNavigateToGmail()
	{
		System.out.println("Gmail Launch and LogIn");
	}
	@Test(priority=0)
	public void Inbox()
	{
		System.out.println("Inbox Functionality Testing");
	}
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("Compose Functionality Testing");
	}
	@Test(priority=2)
	public void SentMail()
	{
		System.out.println("Sent mail Functionality Testing");
	}
	@AfterMethod
	public void ApplicationClose()
	{
		
		System.out.println("Gmail Application Close");
	}
}
