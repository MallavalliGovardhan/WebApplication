package com.LinksTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Vacations_BackToHome 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WebElement Register = driver.findElementByLinkText("REGISTER");
		Register.click();
		driver.manage().window().maximize();
		WebElement Vacations = driver.findElementByLinkText("Vacations");
		Vacations.click();
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img").click();
		driver.close();
		
	}

}
