package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTab {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		WebElement allrow = driver.findElement(By.id("shopping"));
		List<WebElement> tr = allrow.findElements(By.cssSelector("tbody tr"));
		int kanakku =0;
		for (int i = 0; i < tr.size(); i++) {
			List<WebElement> price = tr.get(i).findElements(By.tagName("td"));
			String text = price.get(1).getText();

			kanakku  += Integer.parseInt(text);
			


		}
		WebElement ei = driver.findElement(By.xpath("//*[@id=\"shopping\"]/tfoot/td[2]/b"));
		String text = ei.getText();
		int resu = Integer.parseInt(text);
		if (kanakku==resu) {
			System.out.println("you have passed the webtable consept"+kanakku);
			
		}else {
			System.out.println("you should study well and consentratre to the programmin ");
		}
		
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> th = table.findElements(By.cssSelector("thead tr th"));
		String text2 = th.get(0).getText();
		List<WebElement> trr = table.findElements(By.cssSelector("tbody tr"));
		for (int i = 0; i < trr.size(); i++) {
			List<WebElement> firstname3 = trr.get(i).findElements(By.tagName("td"));
			String text3 = firstname3.get(1).getText();
			System.out.println(text3);
			if (text3.equals("Man")) {
				WebElement cli =firstname3.get(3).findElement(By.tagName("input"));
				cli.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		///driver.quit();
	}
}
