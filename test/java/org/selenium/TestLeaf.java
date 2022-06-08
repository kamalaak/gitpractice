package org.selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("http://www.leafground.com/");
		dri.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		dri.findElement(By.id("email")).sendKeys("kamaleshpeast@gmail.com");
		dri.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" just try to append the text");
		dri.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		dri.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = dri.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		dri.navigate().back();
		dri.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a")).click();
		WebElement position = dri.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x value is "+x +"y value is "+y);
		WebElement color = dri.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);
		WebElement size = dri.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("height is "+ height +"width is "+ width);
		WebElement home = dri.findElement(By.id("home"));
		home.click();
		dri.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a")).click();
		WebElement one = dri.findElement(By.id("dropdown1"));
		Select sel= new Select(one);
		sel.selectByIndex(1);
		WebElement two = dri.findElement(By.name("dropdown2"));
		Select sell = new Select(two);
		sell.selectByVisibleText("Appium");
		List<WebElement> options = sell.getOptions();
		int size2 = options.size();
		System.out.println(size2);
		two.sendKeys("Loadrunner");
		dri.navigate().back();
		dri.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/img")).click();
		WebElement alert = dri.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alert.click();
		Alert al = dri.switchTo().alert();
		al.accept();
		WebElement ale = dri.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		ale.click();
		Alert all = dri.switchTo().alert();
		all.dismiss();
		WebElement ae = dri.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		ae.click();
		Alert a = dri.switchTo().alert();
		a.sendKeys("you can fuck your self");
		
		String text = a.getText();
		System.out.println(text);
		a.accept();
		dri.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		dri.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
