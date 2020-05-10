package com.automationpractice.search;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTest7 extends TestBase{
				//	SEARCH_007
	@Test
	public void auto_suggestion() {
//		Explicit wait; Select; For loop
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//		Enter 'Chif' in search text box on top
		driver.findElement(By.id("search_query_top")).sendKeys("Chif");
//		Verify 'Summer Dresses > Printed Chifton Dress' option get suggested in search textbox with 'Chif' in bold
		String search=driver.findElement(By.xpath("(//strong[text()='Chif'])")).getText();
		System.out.println(search);
	}
	
}
