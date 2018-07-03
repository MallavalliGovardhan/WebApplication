package com.HandlingAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_CheckAvailability_Click
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement checkAvailability = driver.findElementById("searchBtn");
		checkAvailability.click();
		Alert alt = driver.switchTo().alert();
		String altText = alt.getText();
		System.out.println(altText);
		Thread.sleep(10000);
		alt.accept();
		//alt.dismiss();
		//alt.sendKeys("Hello");
		driver.close();
	}

}
