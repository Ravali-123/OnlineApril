package com.ranford.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admhomepage {

	//Element properties
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement Employee;
	
	@FindBy(xpath="//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")
	WebElement Logout;
	
	
	//Element methods
	public void Branch()
	{
		Branch.click();			
	}
	
	public void Role()
	{
		Role.click();			
	}
	
	public void Employee()
	{
		Employee.click();			
	}
	
	public void Logout()
	{
		Logout.click();			
	}
		
	
	
}
    
  