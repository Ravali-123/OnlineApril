package com.ranford.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEmp {

	public static void main(String[] args) throws Exception {
		Library lb = new Library();
		lb.openApp("http://122.175.8.158/ranford2/");
		lb.AdmLgn("Admin", "Testing@");
		
		FileInputStream fis=new FileInputStream("D:\\RavaliSelenium\\RanfordBank\\src\\com\\ranford\\testdata\\REmp.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		XSSFSheet WS=Wb.getSheet("Sheet1");
		
		int rcount=WS.getLastRowNum();
		System.out.println(rcount);
		
		for(int i=1; i<=rcount; i++) {
			XSSFRow Wr=WS.getRow(i);
			
			XSSFCell WC=Wr.getCell(0);
			XSSFCell WC1=Wr.getCell(1);
			XSSFCell WC2=Wr.getCell(2);
			XSSFCell WC3=Wr.getCell(3);
			XSSFCell WC4=Wr.createCell(4);
			
			String Ename=WC.getStringCellValue();
			String Lgnpwrd=WC1.getStringCellValue();
			String Role=WC2.getStringCellValue();
			String Branch=WC3.getStringCellValue();
			
			String res=lb.Employee(Ename, Lgnpwrd, Role, Branch);
			System.out.println(res);
			WC4.setCellValue(res);						
		}
		FileOutputStream fos=new FileOutputStream("D:\\RavaliSelenium\\RanfordBank\\src\\com\\ebanking\\result\\REmpresult.xlsx");
		Wb.write(fos);
		Wb.close();
	}

}
