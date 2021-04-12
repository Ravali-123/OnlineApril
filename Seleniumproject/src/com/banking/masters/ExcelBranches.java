package com.banking.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBranches {


	public static void main(String[] args) throws Exception {
		Library lb=new Library();
	      String lUrl=lb.Launch_Url("http://primusbank.qedgetech.com/");
		  System.out.println(lUrl);
		  
		  lb.Login_Admin("Admin", "Admin");
		  FileInputStream fis=new FileInputStream("D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\testdata\\Branches.xlsx");
		  
		// Workbook
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		  
		  // Sheet
		  XSSFSheet ws=wb.getSheet("Branchesdata");
		  
		  // Role count
		  int rCount=ws.getLastRowNum();
		  System.out.println(rCount);
		  
		  // Multiple iterations.... loop
		  for(int i=1; i<=rCount; i++) {
			  
			  // Row
			  XSSFRow wr=ws.getRow(i);
			  
			  // Cell
			  XSSFCell wc=wr.getCell(0);
			  XSSFCell wc1=wr.getCell(1);
			  XSSFCell wc2=wr.getCell(2);
			  XSSFCell wc3=wr.getCell(3);
			  XSSFCell wc4=wr.getCell(4);
			  XSSFCell wc5=wr.getCell(5);
			  XSSFCell wc6=wr.getCell(6);
			  XSSFCell wc7=wr.getCell(7);
			  XSSFCell wc8=wr.getCell(8);
			  XSSFCell wc9=wr.createCell(9);
			  
			  // Cell values
			  String Branchname=wc.getStringCellValue();
			  String Add1=wc1.getStringCellValue();
			  String Add2=wc2.getStringCellValue();
			  String Add3=wc3.getStringCellValue();
			  String Area=wc4.getStringCellValue();
			  DataFormatter df=new DataFormatter();
			  String Zipcode=df.formatCellValue(wc5);
			  String Country=wc6.getStringCellValue();
			  String state=wc7.getStringCellValue();
			  String city=wc8.getStringCellValue();
			  
			 	
			String res=lb.Branch_Creation(Branchname,Add1,Add2,Add3,Area,Zipcode,Country,state,city);
			System.out.println(res);
			wc6.setCellValue(res);
		  }
		  FileOutputStream fos=new FileOutputStream("D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\Results.xlsx");
	      wb.write(fos);
	      wb.close();
		}
		  
  
	}


