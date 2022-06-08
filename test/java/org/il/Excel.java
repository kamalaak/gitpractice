package org.il;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\kamalesh\\eclipse-workspace\\Km\\Excell\\data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(fi);
		Sheet sheet = work.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row row = sheet.getRow(i);
			
			int ce = row.getPhysicalNumberOfCells();
			for (int j = 0; j <ce; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
			
			
		}
		
		
		
		
			}
			
			
			
		
		
		
		
		
		
	}
	
	
	
	

