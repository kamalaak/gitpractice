package org.il;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Out {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\kamalesh\\eclipse-workspace\\Km\\Excell\\data.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook work = new XSSFWorkbook(fi);
	Sheet sheet = work.getSheet("sheet1");
	Row row = sheet.getRow(2);
	Cell ce = row.getCell(1);
	String st = ce.getStringCellValue();
	if (st.equals("senior")) {
		ce.setCellValue("mayiru");
	}
	
	Sheet cr = work.getSheet("kamalesh");
	Row ro = cr.createRow(2);
	Cell o = ro.createCell(0);
	o.setCellValue("kamalesh");
	Cell c = ro.createCell(2);
	c.setCellValue("what the fuck ");
	
	
	FileOutputStream fill = new FileOutputStream(f);
	work.write(fill);
	
	
	
}
}
