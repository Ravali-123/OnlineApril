package com.ranford.masters;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Role extends Base
{
	@Test(dataProvider = "Rdata")
public void role(String Rn,String Rt ) throws InterruptedException
{
	lib.Role(Rn,Rt);	
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
	
 }
  
}
