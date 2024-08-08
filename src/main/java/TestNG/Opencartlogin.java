package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Opencartlogin {

	WebDriver driver;
	@BeforeTest
	public void Steup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	@Test
	public void loginpagetitleTest()
	{
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title,"Account Login");
	}
	@Test
	public void loginpageURLTest()
	{
	String	URL=driver.getCurrentUrl();
	System.out.println("page url"+URL);
	Assert.assertTrue(URL.contains("route=account/login"));
	
	}
	@AfterTest
	public void Taerdown() {
		driver.quit();
	}
	
	
	
}
