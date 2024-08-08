package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.errors.Apperror;
import com.qaopencart.constant.Appconstant;

public class loginpagetest extends basetest {

	@Test(priority = 1)
	public void loginpageTitleTest() {
		String acttitle = Loginpage.getloginpagetitle();
		Assert.assertEquals(acttitle, Appconstant.Login_page_Title, Apperror.Title_NOT_FOUND);
	}

	@Test(priority = 2)
	public void loginpageURLTest() {
		String acturl = Loginpage.getloginpageURL();
		Assert.assertTrue(acturl.contains(Appconstant.Fraction_url_value), Apperror.URL_NOT_FOUND);

	}

	@Test(priority = 3)
	public void forgotpasswordlinkexist() {
		Assert.assertTrue(Loginpage.checkforgotpassword(), Apperror.Element_NOT_FOUND);
	}

	@Test(priority = 4)
	public void logintest() {
		accPage = Loginpage.dologin(prop.getProperty("username"), prop.getProperty("password"));
		// Assert.assertEquals(actualPagetitle,
		// Appconstant.Account_page_title,Apperror.Title_NOT_FOUND);
		Assert.assertEquals(accPage.getloginpagetitle(), Appconstant.Account_page_title, Apperror.Title_NOT_FOUND);
	}

}
