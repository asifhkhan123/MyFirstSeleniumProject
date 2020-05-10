package com.automationpractice.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProfileTestThree extends TestBase {

	//PROFILE_003
		//Create and delete Wish List
		
		@Test
		public void Create_delete_wish_list() throws InterruptedException {
			//switch to alert; Date; Alert;
//				Go to http://www.automationpractice.com
			driver.get("http://www.automationpractice.com");	
//				Click Sign in button from top right corner of the page
			driver.findElement(By.xpath("//a[@class='login']")).click();
//				Enter valid email address 'imex123@mailinator.com' in email address text field of right side
			driver.findElement(By.id("email")).sendKeys("imex123@mailinator.com");
//				Enter valid password 'imex123' in password text field
			driver.findElement(By.id("passwd")).sendKeys("imex123");
//				Click 'Sign in' button
			driver.findElement(By.id("SubmitLogin")).click();
//				Click MY WISH LISTS button
			driver.findElement(By.xpath("//span[text()='My wishlists']")).click();
			
//				Enter 'My Winter Shopping' in name test field
			driver.findElement(By.id("name")).sendKeys("My Winter Shopping");
//				Click Save button
			driver.findElement(By.xpath("//button[@id='submitWishlist']/span")).click();

//				Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View
		

			String wishlist=driver.findElement(By.xpath("//div[@id='block-history']")).getText();
			//System.out.println(wishlist);
			//Assert.assertEquals(wishlist.contains("My Winter Shopping"),true);
			
//				Delete the created wish list item
			driver.findElement(By.xpath("//i[@class='icon-remove']")).click();
			
//				Click OK from the alert popup
		    Thread.sleep(2000);
		    driver.switchTo().alert().accept();
		   
			
//				Verify wishlist item is removed
		    WebDriverWait driverWait = new WebDriverWait(driver, 10);
			 boolean isPresent = driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//tr[1]/td[1]")));
			 System.out.println(isPresent + "  element is now NOT visible" );
			 
			 Assert.assertEquals(isPresent, true);
			

		}

	}