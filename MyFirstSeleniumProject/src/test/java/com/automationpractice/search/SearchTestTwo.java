package com.automationpractice.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTestTwo extends TestBase {

	@Test
	public void Product_quick_view() throws InterruptedException {

//iframe; frame, driver.switchTo();popup; Actions; mouse hover; explicit wait
//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");

//Click on the 'Quick View' icon of the product that has text has 'Printed Dress' and price is $26.00
		Actions actions = new Actions(driver);
		List<WebElement> printed_Dress_img = driver.findElements(By.xpath("//img[@title='Printed Dress']"));
		actions.moveToElement(printed_Dress_img.get(0)).build().perform();
		WebElement add_comp = printed_Dress_img.get(0).findElement(By.xpath("(//span[text()='Quick view'])[3]"));
		add_comp.click();

//Verify popup opened		

//Verify text displayed 'Printed Dress' on top
		driver.switchTo().frame(1);
		String p_Dress = driver.findElement(By.xpath("//h1[text()='Printed Dress']")).getText();
		Assert.assertEquals(p_Dress, "Printed Dress");
		System.out.println(p_Dress);

//Verify price is $26.00	
		String price = driver.findElement(By.xpath("//span[@id='our_price_display']")).getText();
		Assert.assertEquals(price, "$26.00");
		System.out.println(price);

//Verify social media button appears for 'Twitter', 'Facebook', 'Google+' and "Pinterest'

//mouse hover over both thumbnail and verify image changes on top after hovering
		WebElement thumbs = driver.findElement(By.xpath("//img[@id='thumb_8']"));
		actions.moveToElement(thumbs).build().perform();
		
		Thread.sleep(2000);
		thumbs = driver.findElement(By.xpath("//img[@id='thumb_9']"));
		actions.moveToElement(thumbs).build().perform();
		boolean img_change = driver.findElement(By.id("bigpic")).isDisplayed();
		System.out.println(img_change);

		Thread.sleep(2000);
		
//close the popup	
		WebElement close_button=driver.findElement(By.xpath("//a[@title='Close']"));
		
		actions.moveToElement(close_button).sendKeys("").moveToElement(driver.findElement(By.xpath("//a[@title='Close']"))).click().build().perform();
//		close_button.click();
//		
		
//		JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
		//actions.moveToElement().build().perform();
		
//		javascriptExecutor.executeScript("document.getElementsByClassName('fancybox-item fancybox-close')[0].click();");
 

	}
}
