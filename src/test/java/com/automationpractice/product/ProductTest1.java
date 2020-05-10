package com.automationpractice.product;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProductTest1 extends TestBase{

	
	@Test
	public void product_compare () throws InterruptedException {
				
//		PRODUCT_004
//		Product Compare
//		Explicit wait; Select; For loop
		
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//		Enter 'Dress' in search text box on top
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");

//		Click on search button icon
		driver.findElement(By.name("submit_search")).click();
	
//		Click 'Add to Compare' link for first product
//		Verify On top right of panel, Green Compare button has text 'Compare (1)'
//		Click 'Add to Compare' link for second product now
//		Verify On top right of panel, Green Compare button text changes to  'Compare (2)' 
//		Click on Green Compare button		
		Actions actions=new Actions(driver);
		List<WebElement> all_image_thums=driver.findElements(By.xpath("//li[parent::ul[@class='product_list grid row']]"));		
		actions.moveToElement(all_image_thums.get(0)).build().perform();
		WebElement add_comp = all_image_thums.get(0).findElement(By.xpath(".//a[@class='add_to_compare']"));
		add_comp.click();
		Thread.sleep(2000);
		actions.moveToElement(all_image_thums.get(1)).build().perform();
	    add_comp = all_image_thums.get(1).findElement(By.xpath(".//a[@class='add_to_compare']"));
		add_comp.click();

//		Verify On top right of panel, Green Compare button has text 'Compare (1)'
		
		String com=driver.findElement(By.xpath("(//span[contains(text(),'Compare (') and parent::button])[1]")).getText();
		Assert.assertEquals(com, "Compare (1)");
		System.out.println(com);

//		Verify On top right of panel, Green Compare button has text 'Compare (2)'
//	    com=driver.findElement(By.xpath("(//span[contains(text(),'Compare (') and parent::button])[2]")).getText();
//		Assert.assertEquals(com, "Compare (2)");
//		System.out.println(com);
		
//		Click on Green Compare button
		driver.findElement(By.xpath("(//span[text()='Compare ('])[1]")).click();

//		Verify Properties for first product is: Short Dress
		String pro=driver.findElement(By.xpath("//td[text()='Short Dress']")).getText();
		System.out.println(pro);
////		Verify Properties for second product is: Maxi Dress
		pro=driver.findElement(By.xpath("//td[text()='Maxi Dress']")).getText();
		System.out.println(pro);
////		Verify Styles for first product is: Dressy
		pro=driver.findElement(By.xpath("//td[text()='Dressy']")).getText();
		System.out.println(pro);
////		Verify Style for second product is: Casual
		pro=driver.findElement(By.xpath("//td[text()='Casual']")).getText();
		System.out.println(pro);
////		Verify Compositions for first product is: Viscose
		pro=driver.findElement(By.xpath("//td[text()='Viscose']")).getText();
		System.out.println(pro);
////		Verify Properties for second product is: Viscose
		pro=driver.findElement(By.xpath("//td[text()='Viscose']")).getText();
		System.out.println(pro);
////		Verify Price for first product is: $50.99 //span[text()='$50.99']
		pro=driver.findElement(By.xpath("//span[text()='$50.99']")).getText();
		System.out.println(pro);
////		Verify Price for second product is: $28.98 and 'reduced price' also displayed
		pro=driver.findElement(By.xpath("(//div[@class='prices-container'])[2]")).getText();
		System.out.println(pro);
//			Delete second product from compare list by clicking delete button on right top of the product
		driver.findElement(By.xpath("(//i[@class='icon-trash'])[1]")).click();
//			Verify second product is not in the list any more
		 WebDriverWait driverWait = new WebDriverWait(driver, 120);
		 boolean isPresent = driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@class='img-responsive' and @alt='Printed Dress']")));
		 Assert.assertEquals(isPresent, true);
		 System.out.println(isPresent + " :second product is not in the list" );

	}
	
	
	
}
