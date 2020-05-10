package com.automationpractice.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	
	@BeforeMethod
	public void bm() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
//	@AfterMethod
//	public void am(){
//		driver.close();
//		
//	}
}
