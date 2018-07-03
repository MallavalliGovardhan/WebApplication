package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class APSRTC_HeaderBlock_Testing {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		WebElement headerBlockLinks=driver.findElementByClassName("menu");
		List<WebElement>links=headerBlockLinks.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println();
		for(int i=0;i<links.size();i++)
		{
				String linkname=links.get(i).getText();
				System.out.println(i+" "+linkname);
				links.get(i).click();
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println();
				
				driver.navigate().back();
				
				Sleeper.sleepTightInSeconds(6);
				
				headerBlockLinks=driver.findElementByClassName("menu");
				links=headerBlockLinks.findElements(By.tagName("a"));
		}	
		driver.close();
	}

}




