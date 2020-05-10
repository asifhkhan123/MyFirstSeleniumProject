package com.automationpractice.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTestEight extends TestBase {

	// SEARCH_008
	@Test
	public void Search_with_filter() {
//Actions, explicit wait, mouse hover
//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//Mouse hover over 'Women' menu
		Actions actions = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//a[text()='Women']"));
		actions.moveToElement(e).build().perform();
//Click on 'Summer Dresses' Under Dresses section
		e = driver.findElement(By.xpath("//a[text()='Summer Dresses']"));
		actions.moveToElement(e).build().perform();
		e.click();
//Click on 'White' option from left panel under color
		driver.findElement(By.xpath("//a[text()='White']")).click();
	
//Verify text: There is 1 product displayed on right side

//verify enabled filters option also displayed on left side with 'X' button

//Click on 'X' button from enabled filters
		
//Verify text: There is 3 product displayed on right side

	}

}
