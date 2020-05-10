package com.automationpractice.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class SearchTest3 extends TestBase{
	@Test
	public void product_image_view() throws InterruptedException {
							//SEARCH_003

//explicit wait; action; for loop
//Go to http://automationpractice.com/index.php?id_product=7&controller=product
		driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
//Verify there are 4 thumbnail on the page
		List<WebElement> all_img_tags=driver.findElements(By.xpath("//img[contains(@id,'thumbs_')]"));
		System.out.println(all_img_tags.size());
//click on the first thumbnail
		//Thread.sleep(2000);
		//driver.findElement(By.id("thumb_20")).click();
//verify popup displayed to slideshow
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@class='fancybox-image']")).isDisplayed();
//Click next button and verify image changes, do the same for four images
		for(int i=0; i<all_img_tags.size();i++) {
			WebElement e=all_img_tags.get(i);
			e.click();
		}
		Thread.sleep(2000);
//close the popup
		driver.findElement(By.xpath("//a[@title='Close']")).click();
	}
}
