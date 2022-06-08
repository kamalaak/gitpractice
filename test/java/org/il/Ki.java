package org.il;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ki {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\kamalesh\\eclipse-workspace\\Km\\Excell\\kamal.xlsx");
	
	Workbook work = new XSSFWorkbook();
	Sheet sheet = work.createSheet("kamal");
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("kamalesh akshaya");
	
	FileOutputStream o = new FileOutputStream(f);
	work.write(o);
	
}
}
