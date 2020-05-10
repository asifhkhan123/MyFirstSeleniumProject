package com.action.practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class ActionPractice extends TestBase{
	
	@Test
	public void mouseHover() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//li[contains(@onmouseover,'Sky is Blue')]"));
		actions.moveToElement(e).build().perform();	
	
	}	
	
	
	@Test
	public void dragAndDrop() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
	
	
	
	Actions actions=new Actions(driver);
	WebElement source;
	source=driver.findElement(By.id("drag"));
	WebElement target;
	target=driver.findElement(By.id("drop"));
	
		actions.dragAndDrop(source, target).build().perform();
}

	@Test
	public void keyPress() {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.END).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.sendKeys(Keys.HOME).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


