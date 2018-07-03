package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Registration_Vacations_BackToHome {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		//driver.findElement(By.linkText("REGISTER"))
		//driver.findElementByLinkText("REGISTER")
		
		WebElement Register=driver.findElementByLinkText("REGISTER");
		Register.click();
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		WebElement Vacations=driver.findElement(By.linkText("Vacations"));
		Vacations.click();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		
		
		

	}

}
