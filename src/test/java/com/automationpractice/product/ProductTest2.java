package com.automationpractice.product;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProductTest2 extends TestBase{
	
	
	@Test
	public void Discount_product_listing() throws InterruptedException {
	
//	Go to http://automationpractice.com/index.php
	driver.get("http://automationpractice.com/index.php");
	
//	Verify -5% displayed on product 'Printed Summer Dress'
	Actions actions=new Actions(driver);
	WebElement img=driver.findElement(By.xpath("(//div[@class='product-container'])[4]"));
	actions.moveToElement(img).build().perform();
	
	WebDriverWait webdriverWait=new WebDriverWait(driver, 120);
	WebElement element=webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""
			+"(//div[contains(@class,'right-block') and descendant::span[text()='-5%']"
			+"and descendant::a[contains(text(),'Printed Summer Dress')]])[1]")));
	String msg=element.getText();	
	Assert.assertEquals(msg.contains("-5%"), true);
	System.out.println(msg);

	
	//	Click on More for this product
	  
//	List<WebElement> printed_Dress_img=driver.findElements(By.xpath("//img[@title='Printed Dress']"));		
//	actions.moveToElement(printed_Dress_img.get(0)).build().perform();
//	WebElement add_comp = printed_Dress_img.get(0).findElement(By.xpath("(//span[text()='Quick view'])[3]"));
//	add_comp.click();
//	Thread.sleep(2000);
//	WebElement e=driver.findElement(By.xpath("(//span[text()='More']//parent::a[@itemprop='url'])[5]"));
//	actions.moveToElement(e).build().perform();
//	e.click();
	
	
	//	Verify -5% also displays on right side
		
	}

}
