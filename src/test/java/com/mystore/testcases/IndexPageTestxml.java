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

	import org.apache.commons.collections4.bag.SynchronizedSortedBag;

	public class IndexPageTestxml extends BaseClass{
		IndexPage indexPage;
		
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
		public void verifyTitle() {
			Log.startTestCase("-----verifyTitle-----");
			String actTitle = indexPage.getMyStoreTitle();
			Assert.assertEquals(actTitle, "My Shop");
			System.out.println(actTitle);
			Log.startTestCase("-----verifyTitle------");
		}
		
		@Test
		public void verifyLogo() throws Throwable {
			Log.startTestCase("-----verifyLogo-----");
			indexPage= new IndexPage();
			boolean result=indexPage.validateLogo();
			Assert.assertTrue(result);
			System.out.println(result);
			Log.endTestCase("-----verifyLogo-----");
		}
		
		

	}
