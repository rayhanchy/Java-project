package javaDemo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticingExcel {

	
	public static void main(String[] args) throws IOException {
		

		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.xlsx");
		
		XSSFSheet sheet = wb.getSheet("AA");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		}

}
