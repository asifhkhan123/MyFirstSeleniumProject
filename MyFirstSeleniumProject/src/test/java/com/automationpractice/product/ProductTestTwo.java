package com.automationpractice.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProductTestTwo extends TestBase {


	@Test
	public void Discount_product_listing() throws InterruptedException {
	
//	Go to http://automationpractice.com/index.php
	driver.get("http://automationpractice.com/index.php");
	
//	Verify -5% displayed on product 'Printed Summer Dress'
	Actions actions=new Actions(driver);
	WebElement img=driver.findElement(By.xpath("(//div[@class='product-container'])[4]"));
	actions.moveToElement(img).build().perform();
	
	WebDriverWait webdriverWait=new WebDriverWait(driver, 100);
	WebElement element=webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""
			+"(//div[contains(@class,'right-block') and descendant::span[text()='-5%']"
			+"and descendant::a[contains(text(),'Printed Summer Dress')]])[1]")));
	String msg=element.getText();	
	Assert.assertEquals(msg.contains("-5%"), true);
	System.out.println(msg);
	
	//	Click on More for this product
	WebElement mMove=driver.findElement(By.xpath("(//div[@class='product-container'])[5]"));
	 actions.moveToElement(mMove).build().perform();
	 Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[parent::a[@title='View']])[5]")).click();
	
//	Verify -5% also displays on right side
	String e=driver.findElement(By.xpath("//span[@id='reduction_percent_display']")).getText();
	Assert.assertEquals(e, "-5%");
	System.out.println(e);
	}
	
}	

