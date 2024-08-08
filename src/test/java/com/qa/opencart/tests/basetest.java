package com.qa.opencart.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.driverfactory;

import qa.opencart.pages.Accountpage;
import qa.opencart.pages.loginpage;

public class basetest {
	driverfactory df;
	WebDriver driver;
	protected loginpage Loginpage;
	protected Properties prop;
	protected Accountpage accPage;

	@BeforeTest
	public void setup() {
		df = new driverfactory();
		prop = df.intiproperties();

		driver = df.intialisedriver(prop);
	   Loginpage = new loginpage(driver);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
