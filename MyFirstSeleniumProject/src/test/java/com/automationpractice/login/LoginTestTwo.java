package com.automationpractice.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class LoginTestTwo extends TestBase {
	
	

	@Test
	public void Login_with_valid_userid_but_invalid_password() {
		
		driver.get("http://www.automationpractice.com");

//	Step 2	Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//a[@class='login']")).click();
//	Step 3	Enter valid email address 'imex123@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
//  Step 4	Enter invalid password 'myinvalidpwd' in password text field
		driver.findElement(By.id("passwd")).sendKeys("imex123");
//	Step 5	Click 'Sign in' button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
//	Step 6	Verify error message displayed 'There is 1 error'
		String errmsg=driver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
		Assert.assertEquals(errmsg, "There is 1 error");
		System.out.println("Verify :" +errmsg);
//	Step 7	Verify error message displayed 'Authentication failed.'
		String aut_err=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
		Assert.assertEquals(aut_err, "Authentication failed.");
		System.out.println("Verify :"+ aut_err);
//	
	}
}