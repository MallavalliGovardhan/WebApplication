package com.Annotations;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AnnotationAutoMate_AllBrowser 
{
	@Test
	public void Edge()
	{
		System.setProperty("webdriver.edge.driver", "G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\Liabrary\\MicrosoftWebDriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://facebook.com");
	}

}
