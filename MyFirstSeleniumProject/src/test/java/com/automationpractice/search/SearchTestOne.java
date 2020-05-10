package com.automationpractice.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTestOne extends TestBase {

	// SEARCH_001
	@Test
	public void price_range_Search() throws InterruptedException {
//keyboard press; Keys; Key Press; Actions; Robot; Drag n Drop; slider; custom xpath; xpath traversing; for loop; while loop; do while loop; String to Double convert
//Go to http://www.automationpractice.com
		driver.get(" http://www.automationpractice.com");
//Click on DRESSES button
		driver.findElement(By.xpath("(//a[contains(text(),'Dresses')])[5]")).click();

//slide the price range between  (around) $20.00 to (around) $40.00
//Actions actions=new Actions(driver);
		List<WebElement> slides=driver.findElements(By.xpath("left-block"));

//Verify product listed on right side with price ranges are between $20 to $40 only

	}

}
