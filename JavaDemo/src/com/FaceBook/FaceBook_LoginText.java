package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_LoginText 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//<input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		driver.findElement(By.id("email")).sendKeys("9959579313");
		
		//<input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">
		driver.findElementById("pass").sendKeys("Hello");
		
		//<label id="loginbutton" class="uiButton uiButtonConfirm" for="u_0_3">
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}

}
