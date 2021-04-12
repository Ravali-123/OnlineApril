package primusbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath(" //input[@id='login']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
