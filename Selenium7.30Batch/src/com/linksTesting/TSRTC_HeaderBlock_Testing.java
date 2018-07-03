package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_Testing {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://tsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		WebElement headerBlock=driver.findElement(By.className("menu"));
		
		List<WebElement>headerBlockLinks=headerBlock.
				                          findElements(By.tagName("a"));

		System.out.println(headerBlockLinks.size());
		
		for(int j=0;j<headerBlockLinks.size();j++)
		{
			String headerBlockLink=headerBlockLinks.get(j).getText();
			System.out.println(j+"  "+headerBlockLink);
			
			headerBlockLinks.get(j).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
			headerBlock=driver.findElement(By.className("menu"));
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		}
		
		
		driver.close();
	}

}
