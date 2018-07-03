package com.LinksTesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_IdentifyLinksCount {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//driver.close();
	}

}
