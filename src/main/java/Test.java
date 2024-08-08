import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String browser="chrome";
		   browserutil brUtil=new browserutil();
		   WebDriver driver=brUtil.launchbrowser(browser);
		   brUtil.launchurl("https://naveenautomationlabs.com/opencart/");
		 String title= brUtil.getpagetitle();
		 System.out.println(title);
		 if (title.contains(title)) {
			System.out.println("Title is correct");
		}
		 if (title.equals(title)) {
			 
			 System.out.println("title is correct");
			
		}
		 brUtil.quitbrowser();
	
		 
	}

}
