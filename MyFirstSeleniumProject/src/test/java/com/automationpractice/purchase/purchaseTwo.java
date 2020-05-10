package com.automationpractice.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;



public class purchaseTwo extends TestBase {
//	PURCHASE_002
//	Add remove items in cart
//	Actions; Mouse hover; Explicit wait; try catch
	@Test
	public void add_remove_items_in_cart() throws InterruptedException {
	
//	Go to http://www.automationpractice.com
	driver.get("http://www.automationpractice.com");
//	Mouse hover on  product one
	Actions actions=new Actions(driver) ;
	WebElement img=driver.findElement(By.xpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[1]"));
	actions.moveToElement(img).build().perform();
	Thread.sleep(2000);
//	Click 'Add to Cart'
	driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[1]")).click();
//	Click 'Continue shopping' button
	driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
//	Verify Cart has text '1 Product'
	String text=driver.findElement(By.xpath("//a[@title='View my shopping cart']")).getText();
	Assert.assertEquals(text, "Cart 1 Product");
	System.out.println(text);
//	Mouse hover over 'Cart 1 product' button
	WebElement button=driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
	actions.moveToElement(button).build().perform();
	Thread.sleep(3000);
//	Verify product listed
	
	
//	Now mouse hover on another product
	WebElement img1=driver.findElement(By.xpath("(//a[contains(text(),'Blouse')])[2]"));
	actions.moveToElement(img1).build().perform();
	Thread.sleep(2000);
//	click 'Add to cart' button
	driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[2]")).click();
//	Click on Porceed to checkout
	driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
//	Mouse hover over 'Cart 2 product' button
	WebElement cart_2=driver.findElement(By.xpath("//b[text()='Cart']"));
	actions.moveToElement(cart_2).build().perform();
	Thread.sleep(2000);
//	Verify 2 product listed now
	String pro=driver.findElement(By.xpath("//span[text()='2 Products']")).getText();
	Assert.assertEquals(pro, "2 Products");
	System.out.println(pro);
//	click 'X'button for first product
	driver.findElement(By.xpath("(//i[@class='icon-trash'])[1]")).click();
	Thread.sleep(2000);
//	Verify 1 product deleted and other remain
	 WebDriverWait Wait = new WebDriverWait(driver, 120);
	 boolean product = Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
	 

	
	
	
	}
}
