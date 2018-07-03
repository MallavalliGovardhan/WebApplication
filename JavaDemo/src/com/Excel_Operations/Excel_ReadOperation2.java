package com.Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation2 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("G:\\Selenium\\ProgrmsPrcties\\JavaDemo\\src\\com\\ExcelBackup\\TestData1.xlsx");
		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
		int rowCounnt = Sheet.getLastRowNum();
		for(int i=0;i<=rowCounnt;i++)
		{
			Row r = Sheet.getRow(i);
			int cellCount = r.getLastCellNum();
			for(int j=0;j<cellCount;j++)
			{
				Cell c= r.getCell(j);
				String data = c.getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
	}

}
