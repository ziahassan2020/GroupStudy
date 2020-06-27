package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicClass {
	
	WebDriver driver;
	
	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void getAfterSuite() {
		System.out.println("After Suite");
	}
	@Test
	public void setup() {
		System.out.println("This is my setup");
	}
	String name="SMARTTECH";
	@Test
	@Parameters("BrowserName")
	public void testParameter(String value) {
		if(value.equalsIgnoreCase("chrome")) {
			System.out.println(value);
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.cnn.com");
		} else if(value.equalsIgnoreCase("FireFox")) {
			System.out.println(value);
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.yahoo.com");
		} else if(value.equalsIgnoreCase("IE")) {
			//setupIE
			
		}
		
	}

}
