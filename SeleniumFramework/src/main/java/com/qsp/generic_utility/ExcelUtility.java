package com.qsp.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getStringDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./scr/test/resources/testScriptsData.xlsx");
		Workbook excel = WorkbookFactory.create(fis);
		
	return excel.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	
	
	
	public double getNumberDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./scr/test/resources/testScriptsData.xlsx");
		Workbook excel = WorkbookFactory.create(fis);
		
	return excel.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		
	}
	
	
	public boolean getBooleanDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./scr/test/resources/testScriptsData.xlsx");
		Workbook excel = WorkbookFactory.create(fis);
		
	return excel.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		
	}

}
