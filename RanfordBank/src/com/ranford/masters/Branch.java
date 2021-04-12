package com.ranford.masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Branch extends Base
{
 @Test(dataProvider = "Bdata")
	public void bcre(String Bname,String Add1,String Area,String Zipc,String Cuntry,String Stat,String cty) throws InterruptedException
	{
		lib.branch(Bname,Add1,Area,Zipc,Cuntry,Stat,cty);
	}
	@DataProvider
	
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
		
	}
}
