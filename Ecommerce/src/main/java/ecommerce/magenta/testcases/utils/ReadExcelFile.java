package ecommerce.magenta.testcases.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public Sheet readExcelFile(String filePath, String fileName, String sheetName) throws IOException {
		
		File file =new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wrkBook= null;
		String fileExtension = fileName.substring(fileName.indexOf("."));
		if (fileExtension.equals(".xlsx")) {
			wrkBook=new XSSFWorkbook(inputStream);
		}
		else if (fileExtension.equals(".xls")) {
			wrkBook= new HSSFWorkbook(inputStream);
		}
		
		Sheet sheet = wrkBook.getSheet(sheetName);
		inputStream.close();
		return sheet;
		
	}
	
	public void writeExcelFile(String filePath,String fileName, String sheetName, String value) throws IOException {
		File file = new File(filePath+"\\"+fileName);
		System.out.println(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wrkBook = null;
		String fileExtension = fileName.substring(fileName.indexOf("."));
		if (fileExtension.equals(".xlsx")) {
			wrkBook=new XSSFWorkbook(inputStream);
		}
		else if (fileExtension.equals(".xls")) {
			wrkBook= new HSSFWorkbook(inputStream);
		}
		
		Sheet sheet = wrkBook.getSheet(sheetName);
		int rowCount= sheet.getLastRowNum();
		Row newRow = sheet.createRow(++rowCount);
		newRow.createCell(0).setCellValue(value);;
	//	newCell.setCellValue(value);
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(new File(filePath+"\\"+fileName));
		wrkBook.write(outputStream);
		
		outputStream.close();
	}
	
	public void writeUpdateExcelFile(String filePath,String fileName, String sheetName, String value) throws IOException {
		File file = new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wrkBook = null;
		String fileExtension= fileName.substring(fileName.indexOf("."));
		switch (fileExtension) {
		case ".xlsx": wrkBook=new XSSFWorkbook(inputStream);break;
		case ".xls": wrkBook= new HSSFWorkbook(inputStream);break;
		default: break;
		}
		Sheet sheet = wrkBook.getSheet(sheetName);
		Row lastRow=sheet.getRow(sheet.getLastRowNum());
		lastRow.getCell(0).setCellValue(value);
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(new File(filePath+"\\"+fileName));
		wrkBook.write(outputStream);
		outputStream.close();
	}
}
