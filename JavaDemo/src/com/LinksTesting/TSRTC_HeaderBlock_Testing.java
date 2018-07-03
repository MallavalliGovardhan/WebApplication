package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_Testing 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		WebElement headerBlocklinks=driver.findElementByClassName("menu");
		System.out.println("Meru selected");
		List<WebElement>links=headerBlocklinks.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println();
		for(int j=0;j<links.size();j++)
		{
				String linksName=links.get(j).getText();
				System.out.println(j+" "+linksName);
				links.get(j).click();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println();
				driver.navigate().back();
				Sleeper.sleepTightInSeconds(3);
				headerBlocklinks=driver.findElementByClassName("menu");
				links=headerBlocklinks.findElements(By.tagName("a"));
		}
		driver.close();
	}

}

