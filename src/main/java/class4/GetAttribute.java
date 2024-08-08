package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
  static WebDriver driver;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver=new ChromeDriver();
       driver.get("https://naveenautomationlabs.com/opencart/index.php?rout"
       		+ "e=account/login");
     
       By emailID=By.id("input-email");
       By password=By.id("input-password");
       
       //I will give you Attribute name you give Attribute value
      String palceholdervalue=driver.findElement(emailID).getAttribute("placeholder");
    System.out.println(palceholdervalue);
          
       
       // I Q  ** How do you print entered value 
       //  first i wil find locator and send values and to get entered value 
       //we always use Value at Attribute
       
       driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("990227209");
       String   val=doGetattribute(password,"value");
       System.out.println(val);
	
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
  public static  String doGetattribute(By locator,String attribute)
  {
	  return getElement(locator).getAttribute(attribute);
  }
}
