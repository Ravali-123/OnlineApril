package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Empdtlpage {
	//Element properties
	
		@FindBy(xpath="//*[@id=\"BtnNew\"]")
		WebElement NewEmployee;
		
		@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")
		WebElement Ehome;

		   //Element methods
		public void Empemployee() {
			NewEmployee.click();
		}
		
		public void Ehome() {
			Ehome.click();
		}
	}


