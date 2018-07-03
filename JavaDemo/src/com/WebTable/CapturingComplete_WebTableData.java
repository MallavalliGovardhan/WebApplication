package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingComplete_WebTableData 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
				String data =driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"");
			}
			System.out.println();
		}
		driver.close();
	}

}
