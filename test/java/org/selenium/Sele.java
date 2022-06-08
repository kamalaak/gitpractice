package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sele {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/selectable.html");
	List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"selectable\"]//li"));
	System.out.println(li.size());
	Actions action = new Actions(driver);
	for (WebElement sti : li) {
		action.keyDown(Keys.CONTROL).click(sti).build().perform();
		if (sti.getText().equals("Item 4")) {
			break;
		}
	}
	Thread.sleep(5000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
