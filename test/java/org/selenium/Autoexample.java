package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoexample {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/autoComplete.html");
	driver.findElement(By.id("tags")).sendKeys("s");
	Thread.sleep(4000);
	List<WebElement> courses = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']//li"));
	for (WebElement stri : courses) {
		if (stri.getText().equalsIgnoreCase("selenium")) {
			System.out.println(stri);
			stri.click();
			break;
		}
		
		
		

	}
	driver.quit();
}

}
