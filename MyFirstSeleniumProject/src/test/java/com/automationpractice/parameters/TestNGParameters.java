package com.automationpractice.parameters;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.automationpractice.core.TestBase;


public class TestNGParameters extends TestBase{
	
	//@Parameters({"itemname1","itemname1price","itemname2","itemname2price","itemname3","itemname3price"})
	@Parameters({"itemname1","itemname1price","itemname2","itemname2price",
				 "itemname3","itemname3price","itemname4","itemname4price",
				 "itemname5","itemname5price","itemname6","itemname6price"})
	@Test
	public void test_Ng_para(String itemname1,String itemname1price,
							 String itemname2,String itemname2price,
							 String itemname3,String itemname3price,
							 String itemname4,String itemname4price,
							 String itemname5,String itemname5price,
							 String itemname6,String itemname6price){
			 
//	Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname1);
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname2);
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname3);
		driver.findElement(By.name("submit_search")).click();
		

		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname1);
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname2);
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(itemname3);
		driver.findElement(By.name("submit_search")).click();
	
		
//		"Now search by following items and verify item name and its price appears corectly.
//
//		Item name: Faded Short Sleeve T-shirts ** Item Price: $16.51
//		Item name: Blouse                      ** Item Price: $27.00
//		Item name: Printed Dress               **  Item Price: $26.00
//		Item name: Printed Dress               **  Item Price: $50.99
//		Item name: Printed Summer Dress        **  Item Price: $30.50
//		Item name: Printed Summer Dress        **  Item Price: $16.40

		
	
	
}

}
