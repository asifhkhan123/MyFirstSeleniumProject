package com.automationpractice.profile;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProfileTestOne extends TestBase {
	

	@Test
	public void  Update_name_in_User_Profile () {
//		for loop; if statement; try catch block; try catch finally block
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//		Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
//		Enter valid email address 'imex123@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("imex123@mailinator.com");
//		Enter valid password 'imex123' in password text field
		driver.findElement(By.id("passwd")).sendKeys("imex123");
//		Click 'Sign in' button
		driver.findElement(By.id("SubmitLogin")).click();
//		Click on name 'Misir Ali' from top right corner
		//driver.findElement(By.xpath("//span[text()='asif khan']")).click;
		
//		Click on button 'MY PERSONAL INFORMATION'
		driver.findElement(By.xpath("//span[text()='My personal information']")).click();

//		Verify text displayed 'Please be sure to update your personal information if it has changed.'
		String text=driver.findElement(By.xpath("//p[@class='info-title']")).getText();
		Assert.assertEquals(text, "Please be sure to update your personal information if it has changed.");
		System.out.println("verify :"+ text);

//		Enter new first name as 'Hanif'
		driver.findElement(By.id("firstname")).sendKeys("Hanif");
//		Enter new last name as 'Shanket'
		driver.findElement(By.id("lastname")).sendKeys("Shanket");
//		Click 'Save' button
		driver.findElement(By.xpath("//button[@type='submit']/span[text()='Save']")).click();
//		Verify error message displayed 'There is 1 error'
		driver.findElement(By.xpath("//p[text()='There is 1 error']"));
//		Verify error message displayed 'The password you entered is incorrect'
		driver.findElement(By.xpath("//li[text()='The password you entered is incorrect.']"));
//		Enter current password 'imex123' in password text field
		driver.findElement(By.id("passwd")).sendKeys("imex123");
//		Click 'Save' button
		driver.findElement(By.xpath("//button[@type='submit']/span[text()='Save']")).click();
//		Verify success message displayed 'Your personal information has been successfully updated.'
//		Click on name 'Hanif Shanket' from top right corner
//		Click on button 'MY PERSONAL INFORMATION'
//		Verify text displayed 'Please be sure to update your personal information if it has changed.'
//		Enter first name back as 'Misir'
//		Enter last name back as 'Ali'
//		Click 'Save' button
//		Enter current password 'abc1234' in password text field
//		Click 'Save' button
//		Verify success message displayed 'Your personal information has been successfully updated.'
//		
		
		
	}
	
	

}
