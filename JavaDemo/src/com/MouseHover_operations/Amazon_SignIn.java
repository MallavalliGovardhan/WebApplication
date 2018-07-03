package com.MouseHover_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Amazon_SignIn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		//<a id="nav-link-yourAccount"
		WebElement helloSignIn = driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).build().perform();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='nav_prefetch_yourorders']/span")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
