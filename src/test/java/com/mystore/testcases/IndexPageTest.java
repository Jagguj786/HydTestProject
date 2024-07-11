package com.mystore.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.utility.Log;


public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	
    //@Parameters("browser")
	@BeforeMethod
	public void setup() throws InterruptedException {
		LaunchApp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyTitle() {
		Log.startTestCase("verifyTitle");
		String actTitle = indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Shop");
		System.out.println(actTitle);
		Log.startTestCase("verifyLogo");
	}
	
	@Test
	public void verifyLogo() throws Throwable {
		Log.startTestCase("verifyLogo");
		System.out.println("111");
		indexPage= new IndexPage();
		System.out.println("222");
		boolean result=indexPage.validateLogo();
		System.out.println("333");
		Assert.assertTrue(result);
		System.out.println(result);
		Log.endTestCase("verifyLogo");
	}
	
	

}