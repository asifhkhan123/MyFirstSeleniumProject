package com.automationpractice.registration;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class RegistrationTest2 extends TestBase {
	@Test
	public void registration_new_account() throws InterruptedException {

//	random text, random number
		int random_number;
		random_number=ThreadLocalRandom.current().nextInt(111, 999);
		
//	Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//	Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
//	Enter email address 'XYZ213@mailinator.com' in email address text field of left side, where 'XYZ123' can be random letter and random number
		driver.findElement(By.id("email_create")).sendKeys("xyz559@mailinator.com");
		
//	Click create an account button
		driver.findElement(By.id("SubmitCreate")).click();
		
				
//	Enter first name
		driver.findElement(By.id("customer_firstname")).sendKeys("Asif");
//	Enter last name
		driver.findElement(By.id("customer_lastname")).sendKeys("Khan");
//	Enter password
		driver.findElement(By.id("passwd")).sendKeys("abcdef123");


		//	Enter address
		driver.findElement(By.id("address1")).sendKeys("3556 72st.ny");
		
		//	Enter city
		driver.findElement(By.id("city")).sendKeys("New York");

		//	Enter state
		new Select(driver.findElement(By.xpath("(//select[@id='id_state'])"))).selectByVisibleText("New York");

		//	Enter zipcode
		driver.findElement(By.id("postcode")).sendKeys("11372");

		//	Enter country
		new Select(driver.findElement(By.id("id_country"))).selectByVisibleText("United States");

		//	Enter mobile phone number
		driver.findElement(By.id("phone")).sendKeys("9173459105");
		

		//	Enter alias as 'My Home Address'
		driver.findElement(By.id("alias")).sendKeys("  :Jackson Heights");
		//	Click on Register button
		driver.findElement(By.id("submitAccount")).click();

		//	Verify welcome message displays 'Welcome to your account. Here you can manage all of your personal information and orders.'
		String Msg=driver.findElement(By.xpath("//p[contains(text(),'Welcome to your account.')]")).getText();
		Assert.assertEquals(Msg,"Welcome to your account. Here you can manage all of your personal information and orders." );
		System.out.println("Verify :"+ Msg);
		
		//	Verify firstname and lastname displays on tops right corner
		
		String name=driver.findElement(By.xpath("//a[@class='account']")).getText();
		Assert.assertEquals(name, "Asif Khan");
		System.out.println(name);
		
	}
}
