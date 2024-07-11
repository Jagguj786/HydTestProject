package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.SFAccCreationPage;
import com.mystore.pageobjects.SFAccDetailPage;
import com.mystore.pageobjects.SFHomePage;
import com.mystore.pageobjects.SFLoginPage;

public class SFAccCreationTest extends BaseClass{
	
	SFLoginPage sfloginpage;
	SFHomePage sfhomepage;
	SFAccCreationPage sfacccreationpage;
	SFAccDetailPage sfaccdetailpage;
	
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
		sfacccreationpage=sfhomepage.clickNew();
		sfaccdetailpage=sfacccreationpage.createAcc();
		sfaccdetailpage.verifyAccCreated();
		System.out.println("11111111111");
		String Anum=sfaccdetailpage.accNumber();
		System.out.println(Anum);
		sfhomepage.golbalSearchtext(Anum);
		sfhomepage.Search();
		
		
		
		
		
	}

}