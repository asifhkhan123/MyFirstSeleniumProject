package net.automationpractice.login;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.timentraining.core.TestBase;

public class LoginTests extends TestBase{
	
	
	@Test
	 public void login_with_valid_userid() {
		webui.launch("http://www.automationpractice.com");
		webui.click_element_by_className("login");
		webui.enter_text_by_id("email", "abc123456@gmail.com");
		webui.enter_text_by_id("passwd", "ccccsss");
		webui.click_element_by_id("SubmitLogin");
		
		//String sc=webui.takeScreenshot();
		//System.out.println(sc);
		WebElement e=webui.find_by_xpath("//p[parent::div[contains(@class,'alert-danger')]]");
		validator.verify_text_present_in_element(e,"There is 1 error");
	}
}