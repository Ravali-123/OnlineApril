package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BranchCreation {

	//Element properties
	
	@FindBy(xpath="//*[@id=\"txtbName\"]")
	WebElement Bname;
	
	@FindBy(xpath="//*[@id=\"txtAdd1\"]")
	WebElement Add1;
	
	@FindBy(xpath="//*[@id=\"txtArea\"]")
	WebElement Area;
	
	@FindBy(xpath="//*[@id=\"txtZip\"]")
	WebElement Zipc;
	
	@FindBy(xpath="//*[@id=\"lst_counrtyU\"]")
	WebElement Cuntry;
	
	@FindBy(xpath="//*[@id=\"lst_stateI\"]")
	WebElement State;
	
	@FindBy(xpath="//*[@id=\"lst_cityI\"]")
	WebElement cty;
	
	@FindBy(xpath="//*[@id=\"btn_insert\"]")
	WebElement Sbmt;
	
	
	
	//Element methods
	public void Branch(String bn,String ad1,String ar,String zp,String cnt,String st,String ct) 
	{
		Bname.sendKeys(bn);
		Add1.sendKeys(ad1);
		Area.sendKeys(ar);
		Zipc.sendKeys(zp);
	   new Select(Cuntry).selectByVisibleText(cnt);
	   new Select(State).selectByVisibleText(st);
	   new Select(cty).selectByVisibleText(ct);
	   Sbmt.click();
	   
	   
	   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
