package com.demo.practice;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class TestNGParameter extends TestBase{
	
	@Parameters({"itemname1","itemname1price",
		          "itemname2","itemname2price",
		          "itemname2","itemname3price"
		         })

	@Test
	public void testngpara(
			String itemname1,String itemname1price,
			String itemname2,String itemname2price,
			String itemname3,String itemname3price
			) {
	
		driver.get("http://automationpractice.com");
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname1);
		driver.findElement(By.name("submit_search")).click();
		
//		//get text name
//		
//		//get text price
//		
//		//assert name
//		//assert price

		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname2);
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname3);
		driver.findElement(By.name("submit_search")).click();
}

}
