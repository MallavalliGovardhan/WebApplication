package com.jqueryui_DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragAndDrop_Operations_Jqueryui 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(0);
		
		 WebElement Source = driver.findElement(By.id("draggable"));
		 WebElement destination = driver.findElement(By.id("droppable"));
		 //Thread.sleep(5000);
		 Actions act = new Actions(driver);
		 act.dragAndDrop(Source,destination).build().perform();
		 driver.close();
				
	}

}
