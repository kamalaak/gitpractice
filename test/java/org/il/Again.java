package org.il;

import java.io.File;
import java.io.FileInputStream;
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

public class Again {

	public static String  excel(String path, String sname, int row, int cell ) throws IOException {
	String data = null;
	File f = new File(path);
	FileInputStream stream = new FileInputStream(f);
	Workbook work = new XSSFWorkbook(stream);
		Sheet sheet = work.getSheet(sname);
		Row row2 = sheet.getRow(row);
		Cell cell2 = row2.getCell(cell);
		CellType cellType = cell2.getCellType();
				
		switch (cellType) {
		case STRING:
		data = cell2.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell2)) {
				Date dateCellValue = cell2.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
				String k = sim.format(dateCellValue);
			}else {
				double numericCellValue = cell2.getNumericCellValue();
			}
			break;

		default:
			break;
		}
		return data;
		
	}
	
	
	
	
	
	
}
