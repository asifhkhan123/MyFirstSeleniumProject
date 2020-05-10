package net.automationpractice.com;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;

public class LoginTests extends TestBase {
	
	
	@Test
	public void login_001_login_with_valid_userid() {
		

		webui.launch("http://www.automationpractice.com");

	}
	@Test
	public void login_002_login_with_valid_userid_but_invalid_password() {
		webui.launch("http://www.automationpractice.com");
	}

}
