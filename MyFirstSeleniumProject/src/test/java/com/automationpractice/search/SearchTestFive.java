package com.automationpractice.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTestFive extends TestBase {

	// SEARCH_005

	@Test
	public void Simple_search_and_view_as_grid_and_list() {

//	key press, actions
//	Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//	Enter 'Summer' in search text box on top
		driver.findElement(By.id("search_query_top")).sendKeys("Summer");
//	Now, press Enter using keyboard
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();

//	Verify text: '4 results have been found.' on top right of the content
		String results = driver.findElement(By.xpath("//span[contains(text(),'4 results')]")).getText();
		System.out.println(results);

//	Verify text: 'Showing 1 - 4 of 4 items' displayed
		String text = driver.findElement(By.xpath("//div[contains(text(),'Showing 1 - 4 of 4 items')]")).getText();
		System.out.println(text);

//	Click on 'Grid' icon from top right of panel
		driver.findElement(By.xpath("//i[@class='icon-th-large']")).click();

//	Verify images are displaying as Grid
		boolean image = driver.findElement(By.xpath("//ul[@class='product_list grid row']")).isDisplayed();
		if (!image) {
			System.out.println("Image not displayed.");
		} else {
			System.out.println("Image displayed.");
		}

//	Click on 'List' icon now
		driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();
//
//	Verify images are displaying as list now
//	boolean image_list=driver.findElement(By.xpath("//ul[@class='product_list row']")).isDisplayed();
//	System.out.println(image_list);
	}

}
