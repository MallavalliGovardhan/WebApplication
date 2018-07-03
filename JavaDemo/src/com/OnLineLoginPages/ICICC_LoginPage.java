package com.OnLineLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ICICC_LoginPage 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("http://google.com");
		//<input id="gs_htif0" class="gsfi" disabled="" autocomplete="off" aria-hidden="true" style="border: medium none; padding: 0px; margin: 0px; height: auto; width: 100%; position: absolute; z-index: 1; background-color: transparent; color: silver; transition: all 0.218s ease 0s; opacity: 0; text-align: left; left: 0px;" dir="ltr">
		//driver.findElement(By.id("gs_htif0")).sendKeys("icici net banking");
		
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		
		//<input id="AuthenticationFG.USER_PRINCIPAL"
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("Selenium");
		
		//<input id="AuthenticationFG.ACCESS_CODE"
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("Ab1234@12");
		
		//<input id="VALIDATE_CREDENTIALS1"
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
		driver.close();
		
	}

}

