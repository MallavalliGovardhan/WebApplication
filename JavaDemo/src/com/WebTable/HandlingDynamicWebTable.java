package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDynamicWebTable 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement  table =driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table"));
		//WebElement table = driver.findElementByClassName("tpl-fluid");
		List<WebElement>Rows =table.findElements(By.tagName("tr"));
	
			for(int i=1;i<Rows.size();i++)
			{
				List<WebElement>cols = Rows.get(i).findElements(By.tagName("td"));
				
					for(int j=1;j<cols.size();j++)
					{
						String data = cols.get(j).getText();
						System.out.print(data+"");
					}
					System.out.println();
				}
			//driver.close();
	}

}
