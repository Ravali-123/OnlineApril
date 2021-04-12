package com.banking.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelrole {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Library lb=new Library();
	      String lUrl=lb.Launch_Url("http://primusbank.qedgetech.com/");
		  System.out.println(lUrl);
		  
		  lb.Login_Admin("Admin", "Admin");
		  
		  FileInputStream fis=new FileInputStream("D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\testdata\\Roles.xlsx");
		  
		  // Workbook
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		  
		  // Sheet
		  XSSFSheet ws=wb.getSheet("Sheet1");
		  
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
			  XSSFCell wc3=wr.createCell(3);
			  
			  // Cell values
			  String role1=wc.getStringCellValue();
			  String rDesc1=wc1.getStringCellValue();
			  String rType1=wc2.getStringCellValue();
			  
			String res=lb.Role_Creation(role1, rDesc1, rType1);
			System.out.println(res);
			wc3.setCellValue(res);
		  }
		  FileOutputStream fos=new FileOutputStream("D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\results\\Results.xlsx");
	      wb.write(fos);
	      wb.close();
		}

	}

	
