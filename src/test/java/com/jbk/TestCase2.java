package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void Checktext() {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///E:/JAVA%20BY%20KIRAN/Software/Offline%20Website/Offline%20Website/index.html");
		String expected="Register a new membership";
		String actual=driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText();
		Assert.assertEquals(actual, expected);
	}
}
