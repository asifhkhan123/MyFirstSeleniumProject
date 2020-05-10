package com.automationpractice.registration;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class RegistrationTest1 extends TestBase{
	
	@Test
	public void Register_a_new_account_with_missing_required_fields() {
			
		int random_number;
		random_number=ThreadLocalRandom.current().nextInt(111, 999);
		
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//			Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
		
//			Click on 'Create New Account' button
		driver.findElement(By.id("SubmitCreate")).click();

		String msg = driver.findElement(By.xpath("//li[starts-with(text(),'Invalid email address')]")).getText();
		Assert.assertEquals(msg, "Invalid email address.");
		
		
//			Enter an email address 'www123@mailinator.com' in order to register into the text field
		driver.findElement(By.id("email_create")).sendKeys("www123@mailinator.com");
		
		
//			Click on 'Create New Account' button
		driver.findElement(By.id("SubmitCreate")).click();
		
		
//			Click on Register Button
		driver.findElement(By.id("submitAccount")).click();
		
//			"Verify following validation messages displays:
	
		String actualMsg=driver.findElement(By.xpath("//p[text()='There are 8 errors']")).getText();
		Assert.assertEquals(actualMsg, "There are 8 errors");
		
		
//			You must register at least one phone number.
		String actualMsg1 = driver.findElement(By.xpath("//li[text()='You must register at least one phone number.']")).getText();
		Assert.assertEquals(actualMsg1, "You must register at least one phone number.");
		
////			lastname is required.
		
		actualMsg1 = driver.findElement(By.xpath("//li[child::b[text()='lastname']]")).getText();
		Assert.assertEquals(actualMsg1, "lastname is required.");
	
		
////			firstname is required.
		actualMsg = driver.findElement(By.xpath("//li[child::b[text()='firstname']]")).getText();
		Assert.assertEquals(actualMsg, "firstname is required.");
		
		
//			passwd is required.
		actualMsg=driver.findElement(By.xpath("//li[child::b[text()='passwd']]")).getText();
		Assert.assertEquals(actualMsg, "passwd is required.");

		//			address1 is required.
		actualMsg=driver.findElement(By.xpath("//li[child::b[text()='address1']]")).getText();
		Assert.assertEquals(actualMsg, "address1 is required.");

		//			city is required.
		actualMsg=driver.findElement(By.xpath("//li[child::b[text()='city']]")).getText();
		Assert.assertEquals(actualMsg, "city is required.");

		
		//	The Zip/Postal code you've entered is invalid. It must follow this format: 00000
		actualMsg=driver.findElement(By.xpath("//li[contains(text(),'Zip/Postal code')]")).getText();
		Assert.assertEquals(actualMsg, "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");

		
		//		This country requires you to choose a State.
		
		actualMsg=driver.findElement(By.xpath("//li[text()='This country requires you to choose a State.']")).getText();
		Assert.assertEquals(actualMsg, "This country requires you to choose a State.");
		System.out.println("Test is complete");
		
		//driver.close();
		
	} 
}



