package org.cts.test.login;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFirst {
	static WebDriver driver;
@BeforeClass
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse workspace\\Maven\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
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
	username.sendKeys("Gowtham");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Myvizhi");
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();	
}

@Test
public void tc2() {
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("MyvizhiGowtham");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Gowtham");
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();
}

@Test
public void tc3() {
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("9715465054");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("MyvizhiGowtham");
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();
}

@After
public void endTime() {
	Date d = new Date();
	System.out.println(d);
}

@AfterClass
public static void quitBrowser() {
	driver.quit();

}

}
