package com.ranford.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBranches {

	public static void main(String[] args) throws Exception {

		Library lb = new Library();
		lb.openApp("http://122.175.8.158/ranford2/");
		lb.AdmLgn("Admin", "Testing@");

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

			String res = lb.branch(bn, ad1, ar, zp, cnt, st, ct);
			System.out.println(res);
			wc7.setCellValue(res);
		}
		FileOutputStream fos = new FileOutputStream(
				"D:\\RavaliSelenium\\RanfordBank\\src\\com\\ebanking\\result\\branch.xlsx");
		wb.write(fos);
		wb.close();
	}

}
