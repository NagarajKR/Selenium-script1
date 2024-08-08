package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;

public class Elementutil {
	
	private  WebDriver driver;
	
	public Elementutil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private void nullcheck(String Value)
	{
		if (Value==null) {
			throw new Elementexception("Value is null"+ Value);
		}
	}
	public void dosendkeys(By locator, String Value)
    {
		nullcheck(Value);
   	getElement(locator).sendKeys(Value);
    }
	 
	 public   WebElement getElement(By locator)
    {   
      try {		
		  WebElement element=driver.findElement(locator); 
		  return element;
		} 
		 catch (NullPointerException e) {
		System.out.println("Element is notpresent in this page "+locator);
      e.printStackTrace();
    }
    return null;
    }
	 public   void doclick(By locator)
	   {
		 getElement(locator).click();
	   }
	 
	 public String dogettext(By locator) 
	 {
		return getElement(locator).getText();
	}
	
		
	  public   String doGetattribute(By locator,String attribute)
	  {
		  return getElement(locator).getAttribute(attribute);
	  }
}
