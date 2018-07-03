package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		driver.navigate().to("http://facebook.com");
		
		driver.close();

	}

}
