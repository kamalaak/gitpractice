package org.il;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Second {
public static void main(String[] args) throws IOException {
	
	
	File f = new File("C:\\Users\\kamalesh\\eclipse-workspace\\Km\\Excell\\data.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook work = new XSSFWorkbook(fi);
	Sheet sheet = work.getSheet("sheet1");
	int rows = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < rows; i++) {
		Row row = sheet.getRow(i);
		int cells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cells; j++) {
			Cell cell = row.getCell(j);
			int ty = cell.getCellType();
			switch (ty) {
			case 1:
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				break;
			case 0 :
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
				break;
			default:
				break;
			}
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	}

}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
