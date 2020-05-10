package com.autoit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ComposeEmail extends TestBase {

	
		@Test
		public void Compose_Email_with_Attachment() 
		{
			driver.findElement(By.id("identifierId")).sendKeys("seleniumedureka@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.name("password")).sendKeys("Apple12345");
		}
		
	}


