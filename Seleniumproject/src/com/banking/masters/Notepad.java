package com.banking.masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class Notepad {

	public static void main(String[] args)throws Throwable
{
		// TODO Auto-generated method stub
		Library lib=new Library();
		lib.OpenApp("http://primusbank.qedgetech.com");             
        lib.AdmLgn("Admin","Admin");
        
        //To get test data file path
		String Fpath="D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\testdata\\Roles.txt";
	
		String Rpath="D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\results\\Results.txt";
		String SD;
		//Input File path
       
		FileReader FR=new FileReader(Fpath);
		BufferedReader Br=new BufferedReader(FR);
		String Sread=Br.readLine();
		System.out.println(Sread);
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter Bw=new BufferedWriter(FW);
		Bw.write(Sread+"@@@"+"Results");
		Bw.newLine();
		
		while ((SD=Br.readLine())!=null)
			
		{
			System.out.println(SD);
            String [] Sr=SD.split("###");
            String Rname=Sr[0];
            System.out.println(Rname);
            String Rtype=Sr[1];
            System.out.println(Rtype);
        
            Res=LB.Role(Rname,Rtype);
            System.out.println(Res);
            
            Bw.write(Rname+"%%%"+Rtype+"@@@"+Res);
            Bw.newLine();
		}
		Bw.close();
		Br.close();
		
	}


	}


