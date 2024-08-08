package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeSuite
	public void connectwithDB()
	{
		System.out.println("BS connect with DB");
	}
	@BeforeTest
	public void createruser() {
		System.out.println("BT create user");
	}
	@BeforeClass
	public void launchbrowser() {
		System.out.println("BC Launch Browser");
	}
	@BeforeMethod
	public void logintoapp()
	{
		System.out.println("BM login to App");
	}
	@Test
	public void serachTest() {
		System.out.println("search test");
	}
	@Test
	public void addtocartTest()
	{
		System.out.println("Add to cart test");
	}
	@Test
	public void checkouttest()
	{
		System.out.println("checkout tset");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM logout");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("AC close Browser");
	}
	
	@AfterTest
	public void deleteuser() {
		System.out.println("AT delete user");
	}
	
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS disconnect with DB ");
	}
	
	
	
	
}
