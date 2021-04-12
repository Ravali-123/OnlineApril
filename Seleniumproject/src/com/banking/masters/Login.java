package com.banking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	
	@FindBy(xpath="//*[@id=\"txtuId\"]")
	WebElement Uname;
	
	@FindBy(xpath="//*[@id=\"txtPword\"]")
	WebElement Pwrd;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement Lgn;
	
	//Element methods
	
	public void login() throws InterruptedException {
		
		Uname.sendKeys("Admin");
		Pwrd.sendKeys("Admin");
		Lgn.click();
		Thread.sleep(5000);
	}
	
	
}
