package com.OnLineLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_LoginPage 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/personal/sbi_home.html");
		
		//<a href="https://retail.onlinesbi.com/retail/login.htm">Login</a></div>
		driver.findElementByLinkText("Login").click();
		
		//<a class="login_button" onclick="fnShowContent('errorCode','english')" href="javascript:void(0);">CONTINUE TO LOGIN</a>
		driver.findElementByLinkText("CONTINUE TO LOGIN").click();
		
		//<input id="username" class="form-control" type="text" onkeydown="return disableCtrlKeyCombination(event);" onkeypress="return disableCtrlKeyCombination(event);" onpaste="return false" oncopy="return false" autocomplete="off" onfocus="getFocus(this.id);" maxlength="30" size="30" tabindex="12" name="userName">
		driver.findElement(By.id("username")).sendKeys("ABCDXE");
		
		//<input id="label2" class="form-control" type="password" onkeydown="return disableCtrlKeyCombination(event);" onkeypress="return disableCtrlKeyCombination(event);" onpaste="return false" oncopy="return false" onblur="disableautocompletion(this.id);" autocomplete="off" onfocus="disableautocompletion(this.id);getFocus(this.id);" size="30" title="password" tabindex="13" name="password">
		driver.findElement(By.id("label2")).sendKeys("G1254k");
		
		//<input id="Button2" class="btn btn-default" type="submit" onclick="return submitLoginShagc('kl4GcEpH');" value="Login" title="Login" tabindex="15">
		
		driver.manage().window().maximize();
		driver.findElement(By.id("Button2")).click();
		driver.close();
		
	}

}
