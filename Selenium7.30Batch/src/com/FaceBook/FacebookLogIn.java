package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogIn {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//driver.findElement(By.className("inputtext")).sendKeys("Hello");
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("Hello");
		
		driver.findElement(By.className("inputtext")).sendKeys("Hiii");

	}

}
