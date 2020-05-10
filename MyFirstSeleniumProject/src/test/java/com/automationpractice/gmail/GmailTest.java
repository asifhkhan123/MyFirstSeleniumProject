package com.automationpractice.gmail;



import net.timentraining.core.TestBase;
import net.timentraining.core.mail.Gmail;

public class GmailTest extends TestBase {

	public static void main(String[] args) {
		Gmail gmail=new Gmail("asifhkhan123@gmail.com", "Taaseen123456");
		String mail= gmail.get_most_recent_email();
		System.out.println(mail);

	}

}
