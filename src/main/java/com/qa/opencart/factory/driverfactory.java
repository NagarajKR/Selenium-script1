package com.qa.opencart.factory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;


import com.qa.opencart.errors.Apperror;

public class driverfactory {
    WebDriver driver;
    Properties prop;
    
    public WebDriver intialisedriver(Properties prop )
    {
     String browsername=prop.getProperty("browser");
    	System.out.println("the browser name is "+ browsername);
    	
    	switch (browsername.toLowerCase().trim()) {
		case "chrome": 
		driver=	new ChromeDriver();
			break;
			
		case "firefox": 
			driver=	new  FirefoxDriver();
			break;
			
		case "Edge": 
			driver =new  EdgeDriver();
			break;

		default:
			System.out.println("PLease pass the right browser"+ browsername);
			throw new UnreachableBrowserException(Apperror.BROWSER_NOT_FOUND);
			
		}
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.get(prop.getProperty("url"));
    	return   driver;
    	
    	
    	
    }
    public Properties intiproperties()
    {
    	prop=new Properties();
    	try {
			FileInputStream ip=new FileInputStream("./src/test/java/Config/config.properties");
		
				prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return prop;
    }
    
}
