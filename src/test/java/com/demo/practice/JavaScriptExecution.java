package com.demo.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class JavaScriptExecution extends TestBase{
	
	@Test
	public void javaScrip() {
		driver.get("http://www.automationpractice.com");
		
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("document.getElementById('search_query_top').value='Printed Dress';");
		javascriptExecutor.executeScript("document.getElementsByClassName('login')[0].click();");
		                                  

		//you can use driver again as a standard way
				driver.findElement(By.id("email")).sendKeys("dsdsd");
				
				//click DRESSESS button by javascript executor
				javascriptExecutor.executeScript("document.getElementsByClassName('sf-with-ul')[3].click()");
				
		                                  
		                                  
			}
	


}
