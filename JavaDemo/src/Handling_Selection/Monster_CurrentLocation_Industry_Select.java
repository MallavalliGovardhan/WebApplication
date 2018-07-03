package Handling_Selection;

import java.nio.channels.SelectionKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//select class="border_grey1" size="4" style="width:196px;" name="currentloc">
		 WebElement currentLocation =driver.findElement(By.className("border_grey1"));
		 Select selction = new Select(currentLocation);
		 selction.selectByIndex(3);
		 selction.selectByValue("4");
		 selction.selectByVisibleText("Pune");
		 
		 //Multipule selection from industry element 
		 
		 //select id="id_industry" multiple="multiple" onchange="loadFA(this,document.POPUNDER.jobCategory,''); displayAllFunction();" size="4" name="industry">
		WebElement Industry = driver.findElement(By.id("id_industry"));
		Select selection = new Select(Industry);
		//selection.selectByIndex(1);
		//selection.selectByValue("4");
		//selection.selectByVisibleText("Banking/ Financial Services");
		
		 
		
	}

}
