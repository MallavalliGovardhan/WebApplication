package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Capture_CountyNames 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.name("country"));
		List<WebElement>countryNames = country.findElements(By.tagName("option"));
		System.out.println(countryNames.size());
		for(int k=0;k<countryNames.size();k++)
		{
			System.out.println(k+" "+countryNames.get(k).getText());
			
		}
		Sleeper.sleepTightInSeconds(3);
		driver.close();

	}

}
