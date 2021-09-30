package com.testcase;

import java.io.IOException;

import org.junit.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunction.SeleniumUtilities;

public class LoginTestCase extends Library {
	@BeforeTest
	public void stratUp() {
		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");

	}

	@Test
	public void login() {
		LoginPage lpage = new LoginPage(driver);
		lpage.login("Admin", "admin123");

	}

	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities sUti = new SeleniumUtilities(driver);
		sUti.to_take_screenshot("src\\test\\resources\\Screenshots\\orangeHRMLogin.png");

		quit();

	}

}
