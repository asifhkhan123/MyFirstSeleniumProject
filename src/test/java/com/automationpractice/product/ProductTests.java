package com.automationpractice.product;

import static org.testng.Assert.assertEquals;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProductTests extends TestBase {
	
	
	
	@Test
public void review_on_product() {
	
//	Explicit wait, WebDriverWait; while loop; page refresh; try catch block

		
		driver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
		//Enter valid email address 'imex123@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("imex123@mailinator.com");
		//Enter valid password 'imex123' in password text field
		driver.findElement(By.id("passwd")).sendKeys("imex123");
		//Click 'Sign in' button
		driver.findElement(By.id("SubmitLogin")).click();
		//Go to http://automationpractice.com/index.php?id_product=7&controller=product
		driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
		
		//Click on Write a review
		driver.findElement(By.xpath("//a[@class='open-comment-form']")).click();
				
		//Click Send button without typing anything
		driver.findElement(By.xpath("//button[@id='submitNewMessage' ]/span")).click();

		//		Verify 'Title is incorrect' text displayed
		String title_inco=driver.findElement(By.xpath("//li[text()='Title is incorrect']")).getText();
		Assert.assertEquals(title_inco, "Title is incorrect");
		System.out.println("Verify :"+ title_inco);
		
		//		Verify 'Comment is incorrect' text displayed
		String title_cor=driver.findElement(By.xpath("//li[text()='Comment is incorrect']")).getText();
		Assert.assertEquals(title_cor, "Comment is incorrect");
		System.out.println("Verify :"+ title_cor);
		
//		Enter 'Awesome dress' in title
		driver.findElement(By.xpath("//input[@id='comment_title']")).sendKeys("Awesome dress");
		
//		Enter 'Best purchase ever!!!' in Comment
		driver.findElement(By.xpath("//textarea[@name='content']")).sendKeys("Best purchase ever!!!");
		
//		Click Send button
		driver.findElement(By.id("submitNewMessage")).click();
		
//		Verify 'Your comment has been added and will be available once approved by a moderator' text displayed in popup
		String new_msg=driver.findElement(By.xpath("//p[contains(text(),'approved by a moderator')]")).getText();
		Assert.assertEquals(new_msg, "Your comment has been added and will be available once approved by a moderator");
		System.out.println("Verified  :"+ new_msg);
	
		//	Click OK
		driver.findElement(By.xpath("//button[@type='submit']/span[text()='OK']")).click();
		
		
		
//		Verify  'write a review' button gets appeared after few seconds.
//		You may need to refresh the page until the button gets appear/
//		int retry=0;
//		WebElement element_found=null;
//		while(element_found==null && retry<5) {
//			driver.navigate().refresh();
//			WebDriverWait w = new WebDriverWait(driver,10);
//			element_found=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("write a view")));
//			retry=retry+1;
//		}
//		Assert.assertNotNull(element_found);
		
		
		}
				

	}

		
		
