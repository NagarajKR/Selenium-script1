package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       browserutil butil=new browserutil();
      WebDriver driver= butil.launchbrowser("chrome");
         butil.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        System.out.println(butil.getpagetitle()); 
        System.out.println(butil.getcurrenturl());
       
       
   
       // driver.findElement(By.id("input-email")).sendKeys("na");
        //driver.findElement(By.id("input-password")).sendKeys("9902");
        //2 nd approach
  /*WebElement maiID=driver.findElement(By.id("input-email"));
  WebElement passw=driver.findElement(By.id("input-password"));
  maiID.sendKeys("Nag");
  passw.sendKeys("9902");*/
   // 3rd Approach
   /*
             By  email = By.id("input-email");
            By pass=By.id("input-password");
           WebElement emailID=driver.findElement(email);
           WebElement password=    driver.findElement(pass);
           emailID.sendKeys("HI");
           password.sendKeys("9902");*/
   
   // 4th Approach
  /* By  emailID = By.id("input-email");
   By pass=By.id("input-password");
   
   getElement(emailID).sendKeys("naveenautomation");
   getElement(pass).sendKeys("9902");
   
        
	}
	 public  static WebElement getElement(By locator)
     {
    	return driver.findElement(locator);
     }*/
         
         //5 th Approach
        /* By  emailID = By.id("input-email");
         By pass=By.id("input-password");
         dosendkeys(emailID,"naveen");
         dosendkeys(pass, "990272");*/
         By  emailID = By.id("input-email");
         By pass=By.id("input-password"); 
         Elementutil euti=new Elementutil(driver);
         euti.dosendkeys(emailID, "naven@gmail.com");
         euti.dosendkeys(pass, "9902272809");
         butil.closebroser();
         
	} 
	/* public  static void dosendkeys(By locator, String Value)
     {
    	getElement(locator).sendKeys(Value);
     }
	 
	 public  static WebElement getElement(By locator)
     {
    	return driver.findElement(locator);
     }*/
	
	

         
}
