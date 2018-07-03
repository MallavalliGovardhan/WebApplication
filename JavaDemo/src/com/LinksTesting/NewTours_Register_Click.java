package com.LinksTesting;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click 
{
	public static void main(String[] args) 
	{
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//<a href="mercuryregister.php?osCsid=35a550a66037b20fb053bb12cdc51d63">REGISTER</a>
		driver.findElementByLinkText("REGISTER").click();
		driver.manage().window().maximize();
		//driver.close();
	}

}
