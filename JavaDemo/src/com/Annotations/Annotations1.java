package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 
{
	//@Test
	@Test(priority=0)
	public void BrowserLaunch()
	{
		System.out.println("FireFoxBroswer_Lanuch");
	}
	@Test(priority=1)
	public void LogIn()
	{
		System.out.println("Testing LogIn Functionality");
	}
	@Test(priority=2)
	public void Inbox()
	{
		System.out.println("Testing Inbox Functionality");
	}
	@Test(priority=3)
	public void ComposeMail()
	{
		System.out.println("Testing Compose Functionality");
	}
}
