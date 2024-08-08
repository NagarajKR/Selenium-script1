package qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginpage {
  private  WebDriver driver;
    // 1. page object : By locator
   private  By emailID=By.id("input-email");
   private  By password=By.id("input-password");
   private By loginbutton=By.xpath("//input[@value='Login']");
   private By forgotpassword=By.linkText("Forgotten Password");
   
   //2 public constuctor for page
   public loginpage(WebDriver driver)
   {
  	 this.driver=driver;
  	 
   }
     // 3 public page action/Methods
		public String getloginpagetitle() {
			String title = driver.getTitle();
			System.out.println("login page title" + title);

			return title;
		}

		public String getloginpageURL() {
			String URL = driver.getCurrentUrl();
			System.out.println("login page URL :" + URL);
			return URL;
		}
		 
     public boolean checkforgotpassword() {
    	 return driver.findElement(forgotpassword).isDisplayed();
    	 
     }
     
     public Accountpage dologin(String UN, String Password) {
    	 driver.findElement(emailID).sendKeys(UN);
    	 driver.findElement(password).sendKeys(Password);
    	 driver.findElement(loginbutton).click();
    	 return new Accountpage(driver);
    	 
     //String  title1=  driver.getTitle();
     //System.out.println("account page title"+ title1);
    	//return title1;
    	
     }
     
     
}
