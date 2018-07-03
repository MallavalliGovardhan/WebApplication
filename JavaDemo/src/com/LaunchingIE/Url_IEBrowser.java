package com.LaunchingIE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Url_IEBrowser
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.ie.driver","G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\Liabrary\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	}

}
