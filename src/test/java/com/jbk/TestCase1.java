package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
@Test

public void Checktext(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
driver.get("file:///E:/JAVA%20BY%20KIRAN/Software/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
String expected= "Sign in to start your session";
String actual= driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
Assert.assertEquals(actual, expected);
}

@Test
public void Checktext1() {
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///E:/JAVA%20BY%20KIRAN/Software/Offline%20Website/Offline%20Website/index.html");
	String expected="Sign In";
	String actual=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).getText();
	Assert.assertEquals(actual, expected);
}
}

