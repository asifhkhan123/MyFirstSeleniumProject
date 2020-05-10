package com.automationpractice.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTest6 extends TestBase{
	
			//SEARCH_006
	//Explicit wait; Select; For loop
	@Test
	public void search_and_view() throws InterruptedException{
//Go to http://www.automationpractice.com
		
		driver.get("http://www.automationpractice.com");
		
		
//Enter 'Dress' in search text box on top
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
//Click on search button icon
		driver.findElement(By.xpath("//button[@type='submit' and @name='submit_search']")).click();
//Select Price: Lowest first option from Sort By Dropdown
		new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Price: Lowest first");
//Verify the first product price is: $16.51
		String value=driver.findElement(By.xpath("//span[text()='$16.40']")).getText();
		System.out.println("Lowest_price  :"+ value);
//Select Price: Highest first option from Sort By Dropdown
		new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Price: Highest first");
//Verify the first product price is: $50.99
	    value=driver.findElement(By.xpath("//span[text()='$50.99']")).getText();
		System.out.println("Highest_price :"+ value);		
//Select Product name: A to Z option from Sort By Dropdown
		new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Product Name: A to Z");
//Verify the first product name is: Blouse
		String blouse=driver.findElement(By.xpath("//a[contains(text(),'Blouse') and @title='Blouse']")).getText();
		System.out.println("P_Name :"+ blouse);
//Select Product name: Z to A option from Sort By Dropdown
		new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Product Name: Z to A");
//Verify the first product name is: Printed Summer Dress
		String S_Dress=driver.findElement(By.xpath("(//a[contains(text(),'Printed Summer Dress')])[3]")).getText();
		System.out.println("P_Name :"+ S_Dress);
//Select 'In Stock' option now from Sort By Dropdown		
		new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("In stock");
		Thread.sleep(2000);
//Verify 'In Stock' green button appears for all displayed product
		List<WebElement> G_Button=driver.findElements(By.xpath("//span[@class='available-now']"));
		System.out.println(G_Button);
		
	}
	
	

}
