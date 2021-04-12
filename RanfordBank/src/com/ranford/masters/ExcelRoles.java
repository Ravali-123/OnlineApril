package com.ranford.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRoles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2/");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
			
	}

}
