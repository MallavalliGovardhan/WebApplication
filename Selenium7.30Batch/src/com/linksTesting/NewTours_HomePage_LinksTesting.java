package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksTesting {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
		String linkName=links.get(i).getText();
		System.out.println(i+"  "+linkName);
		
		links.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		// Recreating the arrayList again , since when click operation
	// done on an index of an arrayList(Cache) info in it is going to be 
		// cleared, so is the reason recreating the arrayList again 
		// to store elements 
		links=driver.findElements(By.tagName("a"));
		
		}
		driver.close();

	}

}
