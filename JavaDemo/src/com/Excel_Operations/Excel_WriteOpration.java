package com.Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOpration 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\src\\com\\ExcelBackup\\TestData1.xlsx");
		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
		Row r = Sheet.createRow(6);
		Cell c = r.createCell(3);
		c.setCellValue("I am Good Boy");
		FileOutputStream file1 = new FileOutputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\src\\com\\ExcelBackup\\TestData1.xlsx");
		WorkBook.write(file1);
	}

}
