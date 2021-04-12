package com.ranford.masters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {

	public static WebDriver driver;
	public static String Expval, Actval;

	public static FileInputStream Fis;
	public static Properties Pr;
	public String openApp(String Url) throws IOException, InterruptedException {
		
		
		Fis = new FileInputStream("D:\\RavaliSelenium\\RanfordBank\\src\\com\\ranford\\properties\\Rep.properties");
		Pr = new Properties();
		Pr.load(Fis);
		
		Expval = "Ranford Bank";
		driver=new FirefoxDriver();
		driver.get(Url);
		Thread.sleep(1000);
		

		Actval = driver.findElement(By.xpath(Pr.getProperty("rExpval"))).getText();

		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Application is launched");

		} else {
			System.out.println("Application is failed");

		}
		return Actval;
	}

	public String AdmLgn(String Un, String Pwd) {
		Expval = "Welcome to Admin";

		driver.findElement(By.xpath(Pr.getProperty("Uname"))).sendKeys(Un);
		driver.findElement(By.xpath(Pr.getProperty("Pwrd"))).sendKeys(Pwd);
		driver.findElement(By.xpath(Pr.getProperty("lgn"))).click();

		Actval = driver.findElement(By.xpath(Pr.getProperty("Eadminpage"))).getText();

		if (Expval.equalsIgnoreCase(Actval)) {
			System.out.println("adminhome is displayed");
		} else {
			System.out.println("adminhome is not displayed");

		}
		return Actval;
	}

	public String branch(String bname, String Add1, String Area, String Zip, String Cutry, String State, String cty)
			throws InterruptedException {
		Expval = "Sucessfully";
		driver.findElement(By.xpath(Pr.getProperty("BButtton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("NBbutton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("Bname"))).sendKeys(bname);
		driver.findElement(By.xpath(Pr.getProperty("Add1"))).sendKeys(Add1);
		driver.findElement(By.xpath(Pr.getProperty("Area"))).sendKeys(Area);
		driver.findElement(By.xpath(Pr.getProperty("Zcd"))).sendKeys(Zip);
		new Select(driver.findElement(By.xpath(Pr.getProperty("cunty")))).selectByVisibleText(Cutry);
		new Select(driver.findElement(By.xpath(Pr.getProperty("state")))).selectByVisibleText(State);
		new Select(driver.findElement(By.xpath(Pr.getProperty("city")))).selectByVisibleText(cty);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Pr.getProperty("BSbutton"))).click();
		Actval = driver.switchTo().alert().getText();

		if (Actval.contains(Expval)) {
			System.out.println("Branch created successfully");
		} else {
			System.out.println("Branch already existed");
		}

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(Pr.getProperty("Bhome"))).click();
		return Actval;

	}

	public String Role(String RN, String RT) throws InterruptedException {
		Expval = "Sucessfully";

		driver.findElement(By.xpath(Pr.getProperty("RButton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("NRbutton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("Rname"))).sendKeys(RN);
		new Select(driver.findElement(By.xpath(Pr.getProperty("Rtyp")))).selectByVisibleText(RT);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Pr.getProperty("RSbutton"))).click();

		Actval = driver.switchTo().alert().getText();
		if (Actval.contains(Expval)) {
			System.out.println("Role Created successfully");
		} else {
			System.out.println("role already existed");
		}
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(Pr.getProperty("Rhome"))).click();
		return Actval;
	}

	public String Employee(String ename, String lgnpwrd, String role, String branch) throws InterruptedException {
		Expval = "Successfully";
		driver.findElement(By.xpath(Pr.getProperty("Ebutton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("NEbutton"))).click();
		driver.findElement(By.xpath(Pr.getProperty("Ename"))).sendKeys(ename);
		driver.findElement(By.xpath(Pr.getProperty("Lgnpwrd"))).sendKeys(lgnpwrd);
		new Select(driver.findElement(By.xpath(Pr.getProperty("Role")))).selectByVisibleText(role);
		new Select(driver.findElement(By.xpath(Pr.getProperty("Branch")))).selectByVisibleText(branch);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Pr.getProperty("ESbutton"))).click();
		Actval = driver.switchTo().alert().getText();

		if (Actval.contains(Expval)) {
			System.out.println("Employee created successfully");
		} else {
			System.out.println("Employee already existed");
		}
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(Pr.getProperty("Ehome"))).click();
		return Actval;
	}

	public void admlgt()

	{
		driver.findElement(By.xpath(Pr.getProperty("Lgout"))).click();
		System.out.println("Logout successfully");

	}

	public void Appc() {
		driver.close();
	}

	public void close() {
		driver.close();
	}

}
