package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookScreenShot
{
	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new  FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File Srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Srcfile,new File("G:\\Selenium\\ScreenShots\\FB ScreenShot.png"));
		driver.close();


	}

}
