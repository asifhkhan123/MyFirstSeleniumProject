package com.automationpractice.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationpractice.core.TestBase;
public class LoginTests extends TestBase {
	
	@Test
//	Login with invalid userid 
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
	
	
				//		TCID	LOGIN_002
	
		
		@Test
		public void Login_with_valid_userid_but_invalid_password() {
			
			driver.get("http://www.automationpractice.com");
	
//		Step 2	Click Sign in button from top right corner of the page
			driver.findElement(By.xpath("//a[@class='login']")).click();
//		Step 3	Enter valid email address 'imex123@mailinator.com' in email address text field of right side
			driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
//      Step 4	Enter invalid password 'myinvalidpwd' in password text field
			driver.findElement(By.id("passwd")).sendKeys("imex123");
//		Step 5	Click 'Sign in' button
			driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
//		Step 6	Verify error message displayed 'There is 1 error'
			String errmsg=driver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
			Assert.assertEquals(errmsg, "There is 1 error");
			System.out.println("Verify :" +errmsg);
//		Step 7	Verify error message displayed 'Authentication failed.'
			String aut_err=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
			Assert.assertEquals(aut_err, "Authentication failed.");
			System.out.println("Verify :"+ aut_err);
//		
		}
		
//		TCID	LOGIN_003

		@Test
		public void Login_with_valid_userid_and_password() {
			
			
			driver.get("http://www.automationpractice.com");

//		//Step 2	Click Sign in button from top right corner of the page
			driver.findElement(By.xpath("//a[@class='login']")).click();	
//		//Step 3	Enter valid email address 'imex123@mailinator.com' in email address text field of right side
			driver.findElement(By.id("email")).sendKeys("imex123@mailinator.com");
//		//   Enter valid password 'imex123' in password text field
			driver.findElement(By.id("passwd")).sendKeys("imex123");
//		//Step 5	Click 'Sign in' button
			driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
					
//		//Step 6	Verify 'MY ACCOUNT' text displayed
			String myAcc=driver.findElement(By.xpath("//a[text()='My account']")).getText();
			Assert.assertEquals(myAcc, "My account");
			System.out.println("verify :"+myAcc);

		//Step 7	Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
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
//public void Login_with_invalid_userid (){
//	
//	webui.launch("http://www.automationpractice.com"); 
//
////Click Sign in button from top right corner of the page
//	webui.click_element_by_xpath("//a[@class='login']");
//	webui.enter_text_by_id("email", "abcdef@gmail.com");
//	webui.enter_text_by_id("passwd", "abcdef");
//	webui.click_element_by_id("SubmitLogin");
//	WebElement e=webui.find_by_xpath("//p[parent::div[contains(@class,'alert-danger')]]");
//	validator.verify_text_present_in_element(e, "There is 1 error");
//
