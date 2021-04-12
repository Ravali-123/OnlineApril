package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EmpCreation {
	//Element properties
	 @FindBy(xpath="//*[@id=\"txtUname\"]")
	 WebElement Ename;
	 
	 @FindBy(xpath="//*[@id=\"txtLpwd\"]")
	 WebElement Lgnpwrd;
	 
	 @FindBy(xpath="//*[@id=\"lst_Roles\"]")
	 WebElement Role;
			
	 @FindBy(xpath="//*[@id=\"lst_Branch\"]")
	 WebElement Branch;
	 
	 @FindBy(xpath="//*[@id=\"BtnSubmit\"]")
	 WebElement Esbmt;

	   //Element methods
	 public void Employee() {
		 Ename.sendKeys("Ravali");
		 Lgnpwrd.sendKeys("ravali@123");
		 new Select(Role).selectByVisibleText("Cashierabc");
		 new Select(Branch).selectByVisibleText("gfdghghcnbv");
		 Esbmt.click();
	 }
	 
	 
}
