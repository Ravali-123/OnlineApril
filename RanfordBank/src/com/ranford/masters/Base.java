package com.ranford.masters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base {
	
	Library lib=new Library();
	
  @BeforeTest
  public void beforeTest()   
  {
	  lib.AdmLgn("Admin","Testing@"); 
  }

  @AfterTest
  public void afterTest()
  {
	  lib.admlgt(); 
  }

  @BeforeSuite
  public void beforeSuite() throws Exception 
  {
	  String lUrl=lib.openApp("http://122.175.8.158/ranford2/");
  }

  @AfterSuite
  public void afterSuite()
  {
	  lib.Appc();
  }

}
