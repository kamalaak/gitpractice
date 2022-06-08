package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downl {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/file");
		driver.findElement(By.xpath("/html/body/app-root/app-filemanagement/section[1]/div/div/div[1]/div/div[1]/div/div/label/span")).click();

		StringSelection sele = new StringSelection("C:\\Users\\kamalesh\\Pictures\\Screenshots\\n.png");
		Thread.sleep(5000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		
	}





}
