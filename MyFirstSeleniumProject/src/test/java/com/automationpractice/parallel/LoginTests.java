package com.automationpractice.parallel;

import org.testng.annotations.Test;

import com.automationpractice.core.TestBase;

public class LoginTests extends TestBase {

	@Test
	public void login_test1(){
		driver.get("http://www.amazon.com");
	}

	@Test
	public void login_test2() {
		driver.get("http://www.ebay.com");
	}

	@Test
	public void login_test3() {
		driver.get("http://www.walmart.com");
	}

	@Test
	public void login_test4() {
		driver.get("http://www.target.com");

	}
}