package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextConcept {
 static  WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs"
   		+ ".com/opencart/index.php?route=account/login");
      By header=By.tagName("h2");
      By Forgotpassword=By.linkText("Forgotten Password");
      By para=By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
      
      Elementutil eleuitl= new  Elementutil(driver);
      eleuitl.dogettext(header);
    String  h =eleuitl.dogettext(Forgotpassword);
      System.out.println(h);
      String text=eleuitl.dogettext(para);
      System.out.println(text);
	}
	
            
	
}
