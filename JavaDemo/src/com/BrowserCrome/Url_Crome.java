package com.BrowserCrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Crome 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\Liabrary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://youtube.com");
		driver.close();
		
	}

}
