package com.automationpractice.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class RegistrationOne extends TestBase{
	@Test
	public void account_with_missing_required_fields() {   
		
		
		
		driver.get("http://www.automationpractice.com");

		//	Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
		//	Click on 'Create New Account' button
		driver.findElement(By.name("SubmitCreate")).click();
		//	Verify validation message displayed 'Invalid email address.'
		String actualMsg=driver.findElement(By.xpath("//li[ text()='Invalid email address.']")).getText();
		Assert.assertEquals(actualMsg,"Invalid email address.");
		
		//	Enter an email address 'xyz915@mailinator.com' in order to register into the text field
		driver.findElement(By.id("email_create")).sendKeys("xyz915@mailinator.com");
		
		//	Click on 'Create New Account' button
		 driver.findElement(By.id("SubmitCreate")).click();
		
		//	Click on Register Button
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		 //	"Verify following validation messages displays:

		//	There are 8 errors
		 actualMsg=driver.findElement(By.xpath("//p[text()='There are 8 errors']")).getText();
		Assert.assertEquals(actualMsg, "There are 8 errors");
		
		//	You must register at least one phone number.
		driver.findElement(By.id("phone_mobile")).sendKeys("9173459105");
		//	lastname is required.
		driver.findElement(By.id("lastname")).sendKeys("Khan");
		//	firstname is required.
		driver.findElement(By.id("firstname")).sendKeys("Asif");
		driver.findElement(By.id("company")).sendKeys("Imex International");
		//	passwd is required.
		driver.findElement(By.id("passwd")).sendKeys("abcd123456");
		//	address1 is required.
		driver.findElement(By.id("address1")).sendKeys("3556 72st.ny");
		//	city is required.
		driver.findElement(By.id("city")).sendKeys("New York");
		//	The Zip/Postal code you've entered is invalid. It must follow this format: 00000
		driver.findElement(By.id("postcode")).sendKeys("00000");
		//	This country requires you to choose a State."
		new Select(driver.findElement(By.xpath("(//select[@id='id_state'])"))).selectByVisibleText("New York");
		
		
	}
}

