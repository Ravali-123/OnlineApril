package com.ranford.masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee extends Base
{
	@Test(dataProvider = "Empdata")
public void Emp(String Empname,String Lgnpwrd,String Rn,String Bname) throws InterruptedException 
{
	lib.Employee(Empname,Lgnpwrd,Rn,Bname);
}
	@DataProvider
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
		
		
		
		
		
		
		
		
		
	}
	
	
			
}
