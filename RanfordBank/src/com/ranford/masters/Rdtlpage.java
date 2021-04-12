package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rdtlpage {
	//Element properties
	
	@FindBy(xpath="//*[@id=\"btnRoles\"]")
	WebElement Newrole;
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")
	WebElement Rhome;

	   //Element methods
	public void Nrole() {
		Newrole.click();
	}
	
	public void Rhome() {
		Rhome.click();
	}
}
