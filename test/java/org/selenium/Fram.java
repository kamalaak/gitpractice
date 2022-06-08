package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fram {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver dri = new ChromeDriver();
	dri.manage().window().maximize();
	dri.get("http://www.leafground.com/pages/frame.html");
	List<WebElement> allframe = dri.findElements(By.tagName("iframe"));
	System.out.println(allframe.size());
	
	dri.switchTo().frame(0);
	dri.findElement(By.id("Click")).click();
	dri.switchTo().defaultContent();
	dri.switchTo().frame(1);
	dri.switchTo().frame("frame2");
	dri.findElement(By.id("Click1")).click();
	
	
	Thread.sleep(3000);
	dri.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
