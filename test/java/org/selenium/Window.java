package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver dri = new ChromeDriver();
	dri.manage().window().maximize();
	dri.get("http://www.leafground.com/pages/Window.html");
	String old = dri.getWindowHandle();
	WebElement fistclick = dri.findElement(By.id("home"));
	fistclick.click();
	Set<String> windowHandles = dri.getWindowHandles();
	for (String string : windowHandles) {
		if (!string.equals(old)) {
			dri.switchTo().window(string);
		}
		
	}
	
	WebElement sam = dri.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
	sam.click();
	dri.close();
	dri.switchTo().window(old);
	
	dri.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
	int size = dri.getWindowHandles().size();
	System.out.println("the number of opened windows"+size);
	Set<String> windowHandles2 = dri.getWindowHandles();
	for (String string : windowHandles2) {
		if (!string.equals(old)) {
			dri.switchTo().window(string);
			dri.close();
		}
	}
	dri.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
