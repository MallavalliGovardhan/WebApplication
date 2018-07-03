package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HybrideDataDriven 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test(priority=0)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test(priority=1)
	public void NewUsersRegistration() throws IOException, InterruptedException
	{
		FileInputStream file= new FileInputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\src\\com\\ExcelBackup\\TeatDataNewtoursRegi.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet2");
		
		FileInputStream file1 = new FileInputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\NewToursRegisterTestData.properties");
		Properties pr = new Properties();
		pr.load(file1);
		
		int RowCount = sheet.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
			Row r =sheet.getRow(i);
			Thread.sleep(5000);
			
			driver.findElement(By.name(pr.getProperty("FristName"))).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
			
			double d = r.getCell(2).getNumericCellValue();
					long x = (long)d;
					String PNumber = Long.toString(x);
			
			driver.findElement(By.name(pr.getProperty("PhoneNumber"))).sendKeys(PNumber);
			driver.findElement(By.name(pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("Address"))).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
			
			double p = r.getCell(7).getNumericCellValue();
			long y = (long)p;
			String Pcode = Long.toString(y);
			
			driver.findElement(By.name(pr.getProperty("PinCode"))).sendKeys(Pcode);
			driver.findElement(By.name(pr.getProperty("Counrty"))).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("PassWord"))).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name(pr.getProperty("ConfirmPwd"))).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name("register")).click();
			
			String expectd_UserName = r.getCell(9).getStringCellValue();
			String actual_RegistedText =driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]").getText();
			if(actual_RegistedText.contains(expectd_UserName))
			{
				System.out.println("User Registered Successfully--PASS ");
				r.createCell(12).setCellValue("User Registered Successfully--PASS ");		
			}
			else
			{
				System.out.println("User Registration Failed---FAIL");
				r.createCell(12).setCellValue("User Registration Failed--FAIL");
			}
			FileOutputStream file2 = new FileOutputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\src\\com\\ExcelBackup\\TeatDataNewtoursRegi.xlsx");
			workBook.write(file2);
			driver.navigate().back();
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
