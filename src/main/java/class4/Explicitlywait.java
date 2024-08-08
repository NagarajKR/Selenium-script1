package class4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {

	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 driver =new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://naveenau"
		  		+ "tomationlabs.com/opencart/index.php?route=account/login");
		 By emailid=    By.id("input-email");
		  By password=   By.id("input-password");
		  waitforelemenetpresence(emailid, 10).sendKeys("hi");
		  waitforelemenetpresence(password, 10).sendKeys("na");
	}
	
	public static WebElement waitforelemenetpresence(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
	public static WebElement getelement(By locator) {
		 return driver.findElement(locator);
		 
	}




       }