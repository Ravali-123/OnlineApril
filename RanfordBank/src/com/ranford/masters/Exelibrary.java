package com.ranford.masters;

public class Exelibrary {

	public static void main(String[] args) throws Exception {
		Library lib=new Library();
		String lUrl=lib.openApp("http://122.175.8.158/ranford2/");
		System.out.println(lUrl);
		lib.AdmLgn("Admin","Testing@");
		lib.branch("begumpeticici","Knr@12","padmanagar","12345","INDIA","Kerala","THIRUVANANTHAPURAM");
		lib.Role("CashierAB","E");
		lib.Employee("Vanaja","Vanaja@123","CashierAB","begumpeticici");
		lib.admlgt();
		Thread.sleep(7000);
		lib.Appc();

	}

}
