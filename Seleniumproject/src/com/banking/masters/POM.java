package com.banking.masters;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM {

	WebDriver driver;
	String inputpath="D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\testdata\\POM.xlsx";
	String outputpath="D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\results.xlsx";
	Properties p;
	
	@BeforeTest
	public void setup() {
	WebDriver driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	
	}
	@Test
	public void login() {
	
		//Excel
	
		
		
	}
	
}
