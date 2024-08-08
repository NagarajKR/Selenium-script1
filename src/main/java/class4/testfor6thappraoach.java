package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfor6thappraoach {
  static WebDriver driver;
  
	public static void main(String[] args)
	{
		driver =new ChromeDriver();
		By  emailID = By.id("input-email");
        By pass=By.id("input-password");

	}
	public  static void dosendkeys(By locator, String Value)
    {
   	getElement(locator).sendKeys(Value);
    }
	 
	 public  static WebElement getElement(By locator)
    {
   	return driver.findElement(locator);
    }
       
}
