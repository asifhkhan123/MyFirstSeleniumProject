package com.automationpractice.login;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationpractice.core.TestBase;

public class LoginTestone extends TestBase {
	
	@Test

	
	public void Login_with_invalid_userid () {
//	Basic selenium usage
//	Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//	Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//a[@class='login']")).click();
//	Enter invalid email address 'imex123@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("imex123@mailinator.com");
//	Click Sign in button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
//	Verify error message displayed 'There is 1 error'
		String errMsg=driver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
		Assert.assertEquals(errMsg, "There is 1 error");
		System.out.println("Verify :"+ errMsg);
//	Verify error message displayed 'Password is required.'
	   String errPass=driver.findElement(By.xpath("//li[text()='Password is required.']")).getText();
		Assert.assertEquals(errPass, "Password is required.");
		System.out.println("Verify :"+ errPass);
	
	}
}
	
	

