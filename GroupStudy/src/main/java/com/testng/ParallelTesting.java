package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
