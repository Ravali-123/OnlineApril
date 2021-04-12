package com.ranford.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RavaliSelenium\\RanfordBank\\chromedriver.exe");
		String Expval="Login";	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://122.175.8.158/ranford2/");
Thread.sleep(5000);
String Actval=driver.findElement(By.xpath(".//*[@id='NRI']")).getText();	
System.out.println(Actval);
if (Expval.equalsIgnoreCase(Actval)) 
{
System.out.println("Application is launched");
}
else
{
System.out.println("Application not opened");
}
Expval="Welcome to Admin";
driver.manage().window().maximize();
driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Testing@");
driver.findElement(By.id("login")).click();
Actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
System.out.println(Actval);
if (Expval.equalsIgnoreCase(Actval)) 
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}

driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();

driver.close();
}


	}


