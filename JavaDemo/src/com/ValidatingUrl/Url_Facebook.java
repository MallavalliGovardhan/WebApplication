package com.ValidatingUrl;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Url_Facebook 
{
	public static void main(String[] args) 
	{
		//FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\Liabrary\\chromedriver.exe");
		//ChromeDriver driver = new  ChromeDriver();
		
		System.setProperty("webdriver.gecho.driver","G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\Liabrary\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://facebook.com");
		String exepted_Url="Facebook.com";
		String actual_Url=driver.getCurrentUrl();
		if(actual_Url.contains(exepted_Url))
		{
			System.out.println("URL Matched--PASS");
		}
		else
		{
			System.out.println("URL Not Matched---FAIL");
		}
		driver.manage().window().maximize();
		//driver.close();
		
	}

}
