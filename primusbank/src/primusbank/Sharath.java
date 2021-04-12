package primusbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sharath {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.close();
WebDriver driver2=new FirefoxDriver();
	}
}
