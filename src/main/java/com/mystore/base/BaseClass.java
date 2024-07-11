package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	 @BeforeSuite
	 public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	   
    public static void LaunchApp(String browserName) throws InterruptedException {
    //public static void LaunchApp() throws InterruptedException {
    	
    	//WebDriverManager.chromedriver().setup();
    	//String browserName=prop.getProperty("browser");
		   
    	
    	
    	if(browserName.equalsIgnoreCase("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    	}else if(browserName.equalsIgnoreCase("FireFox")) {
    		//driver = new FirefoxDriver();
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}else if(browserName.equalsIgnoreCase("IE")) {
    		//driver = new InternetExplorerDriver();
    		WebDriverManager.iedriver().setup();
    		driver=new InternetExplorerDriver();
    	}
    	else if(browserName.equalsIgnoreCase("Edge")) {
    		//driver = new InternetExplorerDriver();
    		WebDriverManager.iedriver().setup();
    		driver=new EdgeDriver();
    	}
    	
    	driver.manage().window().maximize();
		//Delete all the cookies
		//driver().manage().deleteAllCookies();
		
    	//Action.implicitWait(driver,10);
    	//Action.pageLoadTimeOut(driver,30);
    	Thread.sleep(5000);
    	driver.get(prop.getProperty("url"));
    	Thread.sleep(3000);
    	
    }
       
      


}
