package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RFBhomepage {

	//Element properties
	
	@FindBy(xpath="//*[@id=\"txtuId\"]")
	WebElement Uname;
	
	@FindBy(xpath="//*[@id=\"txtPword\"]")
	WebElement Pwrd;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement Lgn;
	
	//Element methods
	public void login() {
		
		Uname.sendKeys("Admin");
		Pwrd.sendKeys("Testing@");
		Lgn.click();
				
		
	}
	
	
	
}
