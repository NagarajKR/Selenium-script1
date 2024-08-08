package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver =new ChromeDriver();
  driver.get("https://www.google.com");
    String Titlename= driver.getTitle();
    System.out.println(Titlename);
    
    if(Titlename.equals("Google"))
    {
    	System.out.println("the tiltle name is"+Titlename);
    }
    else {
		System.out.println("title is not correct");
	}
    
   String url=driver.getCurrentUrl();
   System.out.println("The UrL is "+url);
   if (url.contains("google")) {
	   System.out.println("corre t");
   }
	   else
	   {
		   System.out.println("URL is not corect");
	   }
   driver.close();
    
	}

}
