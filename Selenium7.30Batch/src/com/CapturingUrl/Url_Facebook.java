package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

	}

}
