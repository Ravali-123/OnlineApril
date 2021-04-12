package com.banking.scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "‪‪C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://primusbank.qedgetech.com/");
Properties pr=new Properties();
FileInputStream fis=new FileInputStream("D:\\RavaliSelenium\\Seleniumproject\\src\\com\\banking\\properties\\Rep.properties");
pr.load(fis);
driver.findElement(By.xpath(pr.getProperty("Uname"))).sendKeys("Admin");
driver.findElement(By.xpath(pr.getProperty("paswrd"))).sendKeys("Admin");
driver.findElement(By.xpath(pr.getProperty("lgn"))).click();

	}

}
