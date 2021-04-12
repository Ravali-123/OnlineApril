package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RoleCreation {

	//Element properties
 @FindBy(xpath="//*[@id=\"txtRname\"]")
 WebElement Rname;
 
 @FindBy(xpath="//*[@id=\"lstRtypeN\"]")
 WebElement Rtyp;
 
 @FindBy(xpath="//*[@id=\"btninsert\"]")
 WebElement RSbmt;
		

   //Element methods

public void RoleCrtn(String rn, String rtype) {
	// TODO Auto-generated method stub
	 Rname.sendKeys(rn);
	 new Select(Rtyp).selectByVisibleText(rtype);
	 RSbmt.click();
}
 
 
 
 
 
 
}
