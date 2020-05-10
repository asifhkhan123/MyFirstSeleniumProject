package com.automationpractice.search;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTest4 extends TestBase{
	
	
	               //SEARCH_004
	
	@Test
	public void negative_search() {
//	key press, actions
//	Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//	Enter 'invalid' in search text box on top
		driver.findElement(By.id("search_query_top")).sendKeys("invalid");
//	Now, press Enter using keyboard
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
//	Verify text: 'No results were found for your search "invalid"' displayed on the page
		String invalid_Msg=driver.findElement(By.xpath("//p[contains(text(),'No results')]")).getText();
		System.out.println(invalid_Msg);
	}
}
