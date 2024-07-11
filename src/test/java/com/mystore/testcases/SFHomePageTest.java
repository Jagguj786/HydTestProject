package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.SFHomePage;
import com.mystore.pageobjects.SFLoginPage;

public class SFHomePageTest extends BaseClass{
	
	SFLoginPage sfloginpage;
	SFHomePage sfhomepage;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) throws InterruptedException {
		LaunchApp(browser);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Test
	public void clcikAcc() throws InterruptedException {
		
		sfloginpage = new SFLoginPage();
		sfhomepage = sfloginpage.login();
		sfhomepage.clickAccTab();
		sfhomepage.clickNew();
		
	}

}