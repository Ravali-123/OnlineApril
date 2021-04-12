package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrDtlpage {

	//Element properties
	
@FindBy(xpath="//*[@id=\"BtnNewBR\"]")
WebElement Newbrnch;

@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")
WebElement bhm;

   //Element methods
public void Nbrnch() {
	Newbrnch.click();
	
}
public void bhm() {
	bhm.click();
}

}
