package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Title_Google {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\qedge\\Desktop\\730Batch\\WebApplicationTesting\\library\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\qedge\\Desktop\\730Batch\\WebApplicationTesting\\library\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		/*System.setProperty("webdriver.safari.driver", "path of the driver file");
		SafariDriver driver = new SafariDriver();*/
		
		/*System.setProperty("webdriver.opera.driver", "path of driver file");
		OperaDriver driver = new OperaDriver();*/
		
		
		/*System.setProperty("webdriver.edge.driver", "path of the Driver file");
		EdgeDriver driver = new EdgeDriver();*/
		
		/*System.setProperty("webdriver.ie.driver", "path of the Driver file");
		InternetExplorerDriver driver = new InternetExplorerDriver();*/
		
		driver.get("http://google.com");
		
		String expected_Title="Google";
		
		String actual_Title=driver.getTitle();
		
		System.out.println(expected_Title+" - Client Expected Title");
		System.out.println(actual_Title+"  - Developer Given Title");
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched -- FAIL");
		}

		driver.close();
	}
}
