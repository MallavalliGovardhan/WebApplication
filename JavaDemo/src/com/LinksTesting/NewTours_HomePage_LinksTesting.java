package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTours_HomePage_LinksTesting 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		List <WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
			for(int i=0;i<links.size();i++)
			{
			String linkName = links.get(i).getText();
			System.out.println(linkName);
			links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(3);
			links = driver.findElements(By.tagName("a"));
			}
			driver.close();
	}
}

