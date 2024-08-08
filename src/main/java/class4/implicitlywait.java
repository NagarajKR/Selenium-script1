package class4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver =new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  driver.get("https://naveenau"
  		+ "tomationlabs.com/opencart/index.php?route=account/login");
     driver.findElement(By.id("input-email")).sendKeys("nagaraj");
     driver.findElement(By.id("input-password")).sendKeys("948");
     
  
	}

}
