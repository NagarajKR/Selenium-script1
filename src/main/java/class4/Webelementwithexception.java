package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementwithexception {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   driver =new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
   driver.findElement(By.id("input-email")).sendKeys(null);
   
	}

}