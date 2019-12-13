package org.cts.test.login;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JunitAssert {
	static WebDriver driver;
@BeforeClass
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse workspace\\Maven\\drivers\\chromedriver.exe");
	
	ChromeOptions op=new ChromeOptions();
	ChromeOptions a = op.addArguments("--disable-notifications");
	driver = new ChromeDriver(a);
}
@Before
public void startTime() {
	Date d = new Date();
	System.out.println(d);
}


@Test
public void tc1() {
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("9715465054");
	String text = username.getAttribute("value");
	System.out.println(text);
	Assert.assertEquals("9715465054", username.getAttribute("value"));
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("MyvizhiGowham");
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();	

}

@Test
public void tc2() {
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("9715465054");
	Assert.assertTrue(username.getAttribute("value").equals("9715465054"));
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("MyvizhiGowtha");
	Assert.assertEquals("MyvizhiGowtham", password.getAttribute("value"));
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();
//	WebElement out = driver.findElement(By.id("logoutMenu"));
//	out.click();
//	WebElement logout = driver.findElement(By.className("_54nc"));
//	logout.click();
	
	
}

@After
public void endTime() {
	Date d = new Date();
	System.out.println(d);
}

@AfterClass
public static void quitBrowser() {
	driver.close();
}


}


