package org.il;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Se {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\kamalesh\\eclipse-workspace\\Km\\Excell\\data.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook work = new XSSFWorkbook(fi);
	Sheet sheet = work.getSheet("sheet1");
	int rows = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i <rows; i++) {
		Row row = sheet.getRow(i);
		int cells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cells; j++) {
			Cell cell = row.getCell(j);
			//System.out.println(cell);
			
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				String st = cell.getStringCellValue();
				System.out.println(st);
				break;
			case NUMERIC :
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat  da = new SimpleDateFormat("MM M/dd/yyyy");
					String fo = da.format(date);
					System.out.println(fo);
					
				}else {
					double num = cell.getNumericCellValue();
					long l = (long) num;
					String v = String.valueOf(l);
					System.out.println(v);
					
				}
				
				
				break;
			default:
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
		}
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
