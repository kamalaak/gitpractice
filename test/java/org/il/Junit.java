package org.il;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class Junit extends Ak{
	@BeforeClass
	public static void beforeclass() {
		brower("https://www.facebook.com");
	}
	@AfterClass
	public static void afterclass() {
		quit();
	}
	@Before
	public void beformethod() throws InterruptedException {
		dri.navigate().refresh();
	Date date = new Date();
	System.out.println("dare" + date);
	Thread.sleep(5000);
	}
	@After
public void aftermethod() {
	System.out.println("idhu thevaya");
}	
	@Test
public void tc1() {
sendtext("id", "email","kamalesh");
}
@Test
public void tc8() {
sendtext("name", "pass", "akshaya");

}
@Test
public void tc3() {
	sendtext("id", "email","kamalesh");
	sendtext("name", "pass", "akshaya");
assertTrue(false);



	clickbyname("login");
}


}
