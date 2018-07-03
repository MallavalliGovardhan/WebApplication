package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_All_LinksSS 
{

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElementsByTagName("a");
		System.out.println(links.size());
		System.out.println();
		for(int k=0;k<links.size();k++)
		{
		
			String linksName= links.get(k).getText();
			System.out.println(k +" "+ linksName);
			links.get(k).click();
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("G:\\Selenium\\ScreenShots\\"+ k + " "+ linksName+" "+".png"));
		driver.navigate().back();
		links=driver.findElementsByTagName("a");
		}
	}
}
