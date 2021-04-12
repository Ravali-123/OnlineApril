package com.ranford.masters;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POMexe {
	WebDriver driver;
	
  @BeforeTest
  
  public void Login() {
	  
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://122.175.8.158/ranford2/");
	  
	  RFBhomepage RHP=PageFactory.initElements(driver, RFBhomepage.class);
	  RHP.login();
  }
	  @Test
	  
	  public void BranchCreation() throws IOException 
	  {	  
		  FileInputStream fis = new FileInputStream(
					"D:\\RavaliSelenium\\RanfordBank\\src\\com\\ranford\\testdata\\RanBranch.xlsx");

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet ws = wb.getSheet("RBrnch");

			int rCount = ws.getLastRowNum();
			System.out.println(rCount);

			for (int i = 1; i <= rCount; i++) {
				XSSFRow wr = ws.getRow(i);

				XSSFCell wc = wr.getCell(0);
				XSSFCell wc1 = wr.getCell(1);
				XSSFCell wc2 = wr.getCell(2);
				XSSFCell wc3 = wr.getCell(3);
				XSSFCell wc4 = wr.getCell(4);
				XSSFCell wc5 = wr.getCell(5);
				XSSFCell wc6 = wr.getCell(6);
				XSSFCell wc7 = wr.createCell(7);

				String bn = wc.getStringCellValue();
				String ad1 = wc1.getStringCellValue();
				String ar = wc2.getStringCellValue();
				String zp = wc3.getStringCellValue();
				String cnt = wc4.getStringCellValue();
				String st = wc5.getStringCellValue();
				String ct = wc6.getStringCellValue();
			
				
				
	  Admhomepage AHP=PageFactory.initElements(driver, Admhomepage.class);
	 AHP.Branch();
	 
	 BrDtlpage BDP=PageFactory.initElements(driver, BrDtlpage.class);
	 BDP.Nbrnch();
	 
	 BranchCreation bc=PageFactory.initElements(driver,BranchCreation.class);
	 bc.Branch(bn,ad1,ar,zp,cnt,st,ct);
	 
	 
	 driver.switchTo().alert().accept();
	 
	 BDP.bhm(); 
	  
			}
	  }
	  
	 
	
	/* @DataProvider
		
		public Object[][] Bdata()
		{
			Object[][] Obj=new Object[4][7];
			
			Obj[0][0]="Begumpeticici";
			Obj[0][1]="hyd@123";
			Obj[0][2]="padmanagar";
			Obj[0][3]="12653";
			Obj[0][4]="INDIA";
			Obj[0][5]="Kerala";
			Obj[0][6]="THIRUVANANTHAPURAM";
			
			
			Obj[1][0]="SRnagaricici";
			Obj[1][1]="hyd@123";
			Obj[1][2]="padmanagar";
			Obj[1][3]="12653";
			Obj[1][4]="INDIA";
			Obj[1][5]="Kerala";
			Obj[1][6]="THIRUVANANTHAPURAM";
			
			
			Obj[2][0]="kukatpalliicici";
			Obj[2][1]="hyd@123";
			Obj[2][2]="padmanagar";
			Obj[2][3]="12653";
			Obj[2][4]="INDIA";
			Obj[2][5]="Kerala";
			Obj[2][6]="THIRUVANANTHAPURAM";
			
			Obj[3][0]="banjarahillsicici";
			Obj[3][1]="hyd@123";
			Obj[3][2]="padmanagar";
			Obj[3][3]="12653";
			Obj[3][4]="INDIA";
			Obj[3][5]="Kerala";
			Obj[3][6]="THIRUVANANTHAPURAM";
			
			return Obj;
			}*/
	  
	 /* @Test(dataProvider = "Rdata")
	  
	  public void RoleCreation(String rn,String rtype) throws InterruptedException {
		  Admhomepage AHP=PageFactory.initElements(driver, Admhomepage.class);
			 AHP.Role();
			 Thread.sleep(5000);
			 
			 Rdtlpage RDP=PageFactory.initElements(driver, Rdtlpage.class);
			 RDP.Nrole();
			 
			 RoleCreation rc=PageFactory.initElements(driver,RoleCreation.class);
			 rc.RoleCrtn(rn,rtype);
			 
			 
			 driver.switchTo().alert().accept();
			 
			 RDP.Rhome();
			 
	  }
	  
	 @DataProvider
	  public Object [][] Rdata()
	  {
	 	Object[][] Obj=new Object[4][2];
	 	
	 	
	 	Obj[0][0]="Cashier";
	 	Obj[0][1]="E";
	 	
	 	Obj[1][0]="Tellar";
	 	Obj[1][1]="E";
	 	
	 	Obj[2][0]="Cashiericici";
	 	Obj[2][1]="E";
	 	
	 	Obj[3][0]="Cashieridbi";
	 	Obj[3][1]="E";
	 	
	 	return Obj;
	 	
	  }*/
	  
	  /*@Test/*(DataProvider="Empdata")*/
	  
	/*  public void EmpCreation() throws InterruptedException {
		  Admhomepage AHP=PageFactory.initElements(driver, Admhomepage.class);
			 AHP.Employee();
			 Thread.sleep(5000);
			 
			 Empdtlpage EDP=PageFactory.initElements(driver, Empdtlpage.class);
			 EDP. Empemployee();
			 
			 EmpCreation ec=PageFactory.initElements(driver,EmpCreation.class);
			 ec.Employee();
			 
			 
			 driver.switchTo().alert().accept();
			 
			 EDP.Ehome();
	  }
	 /* @DataProvider
		public Object [][] Empdata()
		{
			Object[][] Obj=new Object[4][4];
			
			Obj[0][0]="Ravali";
			Obj[0][1]="ravali@123";
			Obj[0][2]="Cashier";
			Obj[0][3]="Begumpeticici";
			
			Obj[1][0]="Vinay kumar";
			Obj[1][1]="vinay@123";
			Obj[1][2]="Tellar";
			Obj[1][3]="SRnagaricici";		
			
			Obj[2][0]="Narahari";
			Obj[2][1]="narahari@123";
			Obj[2][2]="Cashiericici";
			Obj[2][3]="Kukatpalliicici";		
			
			Obj[3][0]="Vanaja";
			Obj[3][1]="vanaja@123";
			Obj[3][2]="Cashieridbi";
			Obj[3][3]="Banjarahillsicici";
			
			return Obj;
			}*/
			
	 	
	  @AfterTest
	  
	  public void Logout() {
		  driver.close();
		  
	  }
	  
	  
  }  

