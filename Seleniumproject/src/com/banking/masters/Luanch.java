package com.banking.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Luanch {
WebDriver driver;

@Test

public void luan() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");

	Login lgn=PageFactory.initElements(driver, Login.class);
	lgn.login();
	Branch brn=PageFactory.initElements(driver, Branch.class);
	brn.Brch();
	
	  String Actval=driver.findElement(By.xpath("//*[@id=\"login\"]")).getText();
	  String Expval="Login";
	  
	if(Actval.equalsIgnoreCase(Expval)) 
	{
		System.out.println("Same::"+Actval+"   "+Expval);		
	}
	else 
	{
		System.out.println("Not Same::"+Actval+"   "+Expval);
	}
	driver.close();
}
  
 
	  
  }
  
  



