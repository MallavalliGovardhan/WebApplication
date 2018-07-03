package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_FaceBook 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://FaceBook.com");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		driver.close();
	}

}
