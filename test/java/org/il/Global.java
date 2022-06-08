package org.il;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Global {
	static WebDriver dri;
	public static  void brower(String url) {
		
		WebDriverManager.chromedriver().setup();
		 dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get(url);
	}
	
	public static  void sendtext(String log,String val, String key ) {

		if (log.equalsIgnoreCase("id")) {
			WebElement user = dri.findElement(By.id(val));
			user.sendKeys(key);
		}else if (log.equalsIgnoreCase("name")) {
			WebElement user = dri.findElement(By.name(val));
			user.sendKeys(key);
		}else {
			WebElement user = dri.findElement(By.xpath(val));
			user.sendKeys(key);
		}
		
		
		
		
		
		
	}
	
	
	
	public static void sendtextid(String val, String key) {
		WebElement user = dri.findElement(By.id(val));
		user.sendKeys(key);
	}
	public static void sendtextname(String val, String key) {
		WebElement user = dri.findElement(By.name(val));
		user.sendKeys(key);
	}
	
	public static void sendtextxpath(String val, String key) {
		WebElement user = dri.findElement(By.xpath(val));
		user.sendKeys(key);
	}
	public static void clickbyname(String att) {
		WebElement click = dri.findElement(By.name(att));
		click.click();
	}
	
	public static void clickbyxpath(String att) {
		WebElement click = dri.findElement(By.xpath(att));
		click.click();
	}
	public static void clcikbyid(String att) {
		WebElement click = dri.findElement(By.id(att));
		click.click();
	}
	public static void quit() {
		dri.quit();
	}
	public static void gettextbyatt(String val, String getme) {
		WebElement click = dri.findElement(By.id(val));
		String attribute = click.getAttribute(getme);
		System.out.println(attribute);
		
	}
	
	
	public static void gettext(String att,String val) {
		if (att.equalsIgnoreCase("id")) {
			WebElement findElement = dri.findElement(By.id(val));
			String text = findElement.getText();
		}else if (att.equalsIgnoreCase("name")) {
			WebElement findElement = dri.findElement(By.name(val));
			String text = findElement.getText();
			System.out.println(text);
		}else if(att.equalsIgnoreCase("xpath")) {
			WebElement findElement = dri.findElement(By.xpath(val));
			String text = findElement.getText();
			System.out.println(text);
		}else {
			WebElement findElement = dri.findElement(By.className(val));
			String text = findElement.getText();
			System.out.println(text);
		}
		
		
		
	}
	
	
	
	
	
	
}
