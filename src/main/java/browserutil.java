

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserutil {
   WebDriver driver;
   
   
   public WebDriver launchbrowser(String browsername )
   {
   {
	   System.out.println("the browser name is "+browsername);
   }
   
	   switch (browsername) {
	case  "chrome":
	driver=new ChromeDriver();
		break;
	case "Firefox":
	driver=new FirefoxDriver();
	default:
		System.out.println("please pass the right browser"+browsername);
		throw new Browserexception("invalis browser exception"+browsername);
	
	}
	   return driver;
   }
   public void launchurl(String URL) {
	   if (URL==null)
	   {
		   throw new Browserexception("Invlaid URL"+ URL);
	   }
	   if(URL.isBlank()||URL.isEmpty())
	   {
		   throw new Browserexception("Blank/Empty URL"+ URL);   
	   }
	   
	   //https://google.com
	   
	   if(URL.indexOf("https")!=0)
	   {
		   throw new Browserexception("Urlnot contain  https"+URL);
	   }
	   driver.get(URL.trim());
   }
   public String getpagetitle()
   {
	   return driver.getTitle();
   }
   public String getcurrenturl() {
	   return driver.getCurrentUrl();
   }
   public void quitbrowser() {
	   driver.close();
   }
   public void closebroser()
   {
	   driver.close();
   }
   
        
         
  
  
  
}
