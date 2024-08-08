package class4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElement {
  static WebDriver driver;
   public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/o"
			+ "pencart/index.php?route=account/login");
	  By forgotpasswordlink=By.linkText("Forgotten Password");
	   By Login=By.linkText("Login");
	   
	   Elementutil element=new Elementutil(driver);
	   element.doclick(forgotpasswordlink);
	 element. doclick(Login);
	 
	   
   }
 
	 
	   
   }
	     
	    


