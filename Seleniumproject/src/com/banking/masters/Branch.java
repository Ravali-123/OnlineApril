package com.banking.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Branch {
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Brnch;
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[3]/a/img")
	WebElement lgout;
	
	public void Brch() throws InterruptedException {
		
		Brnch.click();
		Thread.sleep(5000);
		lgout.click();
		Thread.sleep(5000);
	}
}
