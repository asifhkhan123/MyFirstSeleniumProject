package com.automationpractice.product;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ProductTestThree extends TestBase {
	
	@Test
	public void Colour_choosing_on_product() throws InterruptedException {
	

//	Go to http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue
		driver.get("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue");
//	Click colour button 'blue' from right side
		
		driver.findElement(By.xpath("//a[@id='color_14']")).click();
		Thread.sleep(4000);
//	Verify left side image changes
		boolean img_C=driver.findElement(By.xpath("//img[@id='bigpic']")).isDisplayed();
		Assert.assertEquals(img_C, true);
		System.out.println(img_C +": Image Change");
		
//	Click colour orange now
		driver.findElement(By.xpath("//a[@id='color_13']")).click();
		
//	Verify image on left side is not the same one before
	boolean img_C_C=driver.findElement(By.xpath("//img[@id='bigpic']")).isDisplayed();
	Assert.assertEquals(img_C_C, true);
	System.out.println(img_C_C  + " : Image Color Change");
	}

}


