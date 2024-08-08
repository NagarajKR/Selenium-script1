package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.qa.opencart.errors.Apperror;
import com.qaopencart.constant.Appconstant;



public class Accountpagetest extends basetest {

	@BeforeClass
	public void acctsetup() {
		accPage = Loginpage.dologin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void acctPageTitle() {
		Assert.assertEquals(accPage.getloginpagetitle(), Appconstant.Account_page_title, Apperror.Title_NOT_FOUND);
	}

	@Test
	public void accpageURLTest() {
		Assert.assertTrue(accPage.getloginpageURL().contains(Appconstant.Account_Fraction_url_value),Apperror.URL_NOT_FOUND);
	}

	@Test
	public void accpageheaderTest() {
		List<String> acctpageheaderslist = accPage.getAccountpageheaders();
		Assert.assertEquals(acctpageheaderslist, Appconstant.ACC_page_header_list);
	}
}
