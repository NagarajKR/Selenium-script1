package class4;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class totallinks {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=accoun"
   		+ "t/login");
   By link= By.tagName("a");
   By Image=By.tagName("img");
   System.out.println("total links ="+ getElementcount(link));
   System.out.println("Total Images="+ getElementcount(Image));
    List<String> Linktextlist =gettextlist(link);
    System.out.println(Linktextlist);
  /*List<WebElement> linklist=driver.findElements(By.tagName("a"));
  System.out.println("Total number of links"+linklist.size());
  /*for(int i=0; i<linklist.size();i++)
  {
	String  text=linklist.get(i).getText();
	if(text.length()!=0)
	{
		System.out.println(text);
	}
	
  for(WebElement e :linklist)
  {
  String Text=e.getText();
  if(Text.length()!=0)
  {
	  System.out.println(Text);
  }
  }*/
   
   
	}
   public static List<WebElement> getElement(By locator)
   {
	  return driver.findElements(locator);
   }
   public static int getElementcount(By locator)
   {
	  return getElement(locator).size();
    }
   public static List<String> gettextlist(By locator)
   {
	 List<WebElement>  eleList=getElement(locator);
	 List<String>eletextlist=new ArrayList<String>();
	 for(WebElement e: eleList)
	 {
		String text=e.getText();
		 if(text.length()!=0)
		 {
			eletextlist.add(text); 
		 }
		 
	 }
	 return eletextlist;
   }

	
   

}
