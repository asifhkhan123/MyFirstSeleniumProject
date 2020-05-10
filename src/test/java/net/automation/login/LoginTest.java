package net.automation.login;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;
import net.timentraining.core.TestBaseSettings;

public class LoginTest extends TestBase {
	
	
		
		@Test
		public void login_with_valid_userid_and_pwd() {
		webui.launch("http://www.automationpractice.com");
		}

		@Test
		public void login_with_invalid_userid_and_psd() {
			webui.launch("http://www.automationpractice.com");
		}
		@Test
		public void login_with_valid_userid_and_invalid_pwd() {
			webui.launch("http://www.automationpractice.com");

			
		}
	}



