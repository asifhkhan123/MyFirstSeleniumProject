package com.automationpractice.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;


public class PurchaseOne extends TestBase {
//	PURCHASE_001
//	Purchase a T-Shirt
//	Actions; Mouse hover; getTitle; 
	
	@Test
	public void purchase_A_T_Shirt() throws InterruptedException{
//	Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//	Click 'DRESSES' button
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
//	Click 'CASUAL DRESSES' thumnail under Subcategories
		driver.findElement(By.xpath("(//a[contains(text(),'Casual Dresses')])[5]")).click();
//	Mouse hover to the thumbnail of 'Printed Dress' image
		Actions actions=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		actions.moveToElement(e).build().perform();
		Thread.sleep(2000);
//	Click 'Add to Cart' button
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
//	Verify message displayed 'Product successfully added to your shopping cart'
		// String text= driver.findElement(By.xpath(("(//h2)[1]"))).getText();
		// Assert.assertEquals(text, "Product successfully added to your shopping cart");
		//driver.findElement("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	//	 Assert.assertEquals(text, "Product successfully added to your shopping cart");
//	Verify message displayed 'There are 1 items in your cart.'
	//	text=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]")).getText();
	//	Assert.assertEquals(text, "There are 1 items in your cart.");
//	Verify message displayed 'Total products $26.00'
	//	driver.findElements(By.xpath("(//div[@class='layer_cart_row'])"));
		
	//	Assert.assertEquals(text, "Total products $26.00");
//	Verify message displayed 'Total shipping $2.00'
		
//	Verify message displayed 'Total $28.00'
//	Verify message displayed 'Customers who bought this product also bought:'
//	Click 'Proceed to checkout' button
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
//	Verify url has 'controller=order'
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
//	Click 'Proceed to checkout' button
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
//	Verify page title is: 'Login - My Store'
		title=driver.getTitle();
		System.out.println(title);
//	Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("imex123@mailinator.com");
//	Enter valid password 'abc1234' in password text field
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("imex123");
//	Click 'Sign in' button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
//	Verify delivery address and billing address are same
	boolean s_Address=driver.findElement(By.xpath("//label[text()='Use the delivery address as the billing address.']")).isDisplayed();
		Assert.assertEquals(s_Address, true);
		System.out.println(s_Address);
//	Click 'Proceed to checkout' button
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
//	Click 'Proceed to checkout' button again
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	Verify popup displayed with message 'You must agree to the terms of service before continuing.'
		String msg=driver.findElement(By.xpath("//p[contains(text(),'You must agree')]")).getText();
		Assert.assertEquals(msg,"You must agree to the terms of service before continuing.");
		System.out.println(msg);
		//	Close the popup
		driver.findElement(By.xpath("//a[@title='Close']")).click();
//	Check I agree to the term ... checkbox
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
//	Click 'Proceed to checkout' button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	Verify text displayed 'Your payment method'
		msg=driver.findElement(By.xpath("//span[text()='Your payment method']")).getText();
		Assert.assertEquals(msg, "Your payment method");
		System.out.println(msg);
//	Verify total price is: $28.00
		msg=driver.findElement(By.xpath("(//span[text()='$28.00'])[2]")).getText();
		Assert.assertEquals(msg, "$28.00");	
		System.out.println(msg);
//	Click 'Pay by bank wire' button
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
//	Verify popup displayed with message 'ORDER SUMMARY'
		msg=driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(msg, "ORDER SUMMARY");	
		System.out.println(msg);
//	Verify popup displayed with message 'BANK-WIRE PAYMENT.'
		msg=driver.findElement(By.xpath("//h3")).getText();
		Assert.assertEquals(msg, "BANK-WIRE PAYMENT.");	
		System.out.println(msg);
//	Verify popup displayed with message 'You have chosen to pay by bank wire. Here is a short summary of your order:'
		msg=driver.findElement(By.xpath("//p[@class='cheque-indent']")).getText();
		Assert.assertEquals(msg, "You have chosen to pay by bank wire. Here is a short summary of your order:");	
		System.out.println(msg);
//	Verify popup displayed with message '- The total amount of your order comes to: $28.00 (tax incl.)'
		msg=driver.findElement(By.xpath("(//p[2])[2]")).getText();
		Assert.assertEquals(msg, "- The total amount of your order comes to: $28.00 (tax incl.)");	
		System.out.println(msg);
//	Verify popup displayed with message '- We allow the following currency to be sent via bank wire: Dollar'
		msg=driver.findElement(By.xpath("(//p[3])")).getText();
		Assert.assertEquals(msg, "- We allow the following currency to be sent via bank wire: Dollar");	
		System.out.println(msg);
//	Verify popup displayed with message 'You must agree to the terms of service before continuing.'
//		msg=driver.findElement(By.xpath("(//p[3])")).getText();
//		Assert.assertEquals(msg, "You must agree to the terms of service before continuing.");	
//		System.out.println(msg);
//	Verify popup displayed with message '- Bank wire account information will be displayed on the next page. '
		
//	Verify popup displayed with message '- Please confirm your order by clicking "I confirm my order.".'
		
//	Click 'I confirm my order' button
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
//	Verify popup displayed with message 'Your order on My Store is complete.
		msg=driver.findElement(By.xpath("//strong[text()='Your order on My Store is complete.']")).getText();
		Assert.assertEquals(msg, "Your order on My Store is complete.");
		System.out.println(msg);
//	Verify popup displayed with message 'Please send us a bank wire with '
		msg=driver.findElement(By.xpath("")).getText();
		Assert.assertEquals(msg, "Please send us a bank wire with");
		System.out.println(msg);
//	Verify popup displayed with message '- Amount $28.00 '
//	Verify popup displayed with message '- Name of account owner Pradeep Macharla '
//	Verify popup displayed with message '- Bank name RTP'
//	Verify popup displayed with message 'You must agree to the terms of service before continuing.'
//	Verify popup displayed with message '- Bank wire account information will be displayed on the next page. '
//	Verify popup displayed with message '- Please confirm your order by clicking "I confirm my order.".'
//	Click on name 'Misir Ali' from top right corner
		driver.findElement(By.xpath("//span[text()='asif khan']")).click();
//	Click on ORDER HISTORY AND DETAILS button
		
//	Verify there is an order placed today.
		
//	Click 'Sign out' button from top right corner
		
	}

}
