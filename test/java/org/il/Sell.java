package org.il;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sell {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	File f = new File("C:\\Users\\kamalesh\\Desktop\\New folder (3)\\kamalesh.txt");
			WebDriverManager.chromedriver().setup();
			WebDriver dri = new ChromeDriver();
			dri.manage().window().maximize();
			dri.get("http://greenstech.in/selenium-course-content.html");
			WebElement ser = dri.findElement(By.tagName("h1"));
			String text = ser.getText();
			System.out.println(text);
	
	FileUtils.write(f,text);
	dri.quit();
	
	
	String fk = FileUtils.readFileToString(f);
	System.out.println(fk);
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
