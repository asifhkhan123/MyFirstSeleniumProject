package com.automationpractice.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class LoginTestThree extends TestBase{
	
	
//	TCID	LOGIN_003

	@Test
	public void Login_with_valid_userid_and_password() {
		
		
		driver.get("http://www.automationpractice.com");

//	Step 2	Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//a[@class='login']")).click();	
//	Step 3	Enter valid email address 'imex123@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("imex123@mailinator.com");
//	   Enter valid password 'imex123' in password text field
		driver.findElement(By.id("passwd")).sendKeys("imex123");
//	Step 5	Click 'Sign in' button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
				
//	Step 6	Verify 'MY ACCOUNT' text displayed
		String myAcc=driver.findElement(By.xpath("//a[text()='My account']")).getText();
		Assert.assertEquals(myAcc, "My account");
		System.out.println("verify :"+myAcc);

//	Step 7	Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		String welcome_msg=driver.findElement(By.xpath("//p[contains(text(),'Welcome to your account.')]")).getText();
		Assert.assertEquals(welcome_msg, "Welcome to your account. Here you can manage all of your personal information and orders.");
		System.out.println("verify :"+welcome_msg);
		
//		Step 8	Verify 'My personal information' text displayed
		String per_info=driver.findElement(By.xpath("//a[@title='Information']//span")).getText();
		Assert.assertEquals(per_info, "MY PERSONAL INFORMATION");
		System.out.println("verify :"+ per_info);
		
//		Step 9	Click 'Sign out' button from top right corner
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
	
	
	}
	

}
	
	


