package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SFAccDetailPage extends BaseClass{
	
	@FindBy(xpath="//td[contains(text(),\"Account Name\")]//following::div[1]") private WebElement AccNameToSearch;
	@FindBy(xpath="//label[contains(text(),\"Account Name\")]//following::input[1]") private WebElement AccName;
	@FindBy(xpath="//h2[contains(text(),\"Account Detail\")]") private WebElement AccDetailText;
	
	public SFAccDetailPage() {
		PageFactory.initElements(driver, this);
	}
	
    public String accNumber() throws InterruptedException {
    	String num = AccNameToSearch.getText();
    	System.out.println(num);
		return num;
    	
    }
    
    public void verifyAccCreated() {
    	
    	String ActaccDetail = AccDetailText.getText();
    	String ExpaccDetail = "Account Detail";
    	System.out.println(ActaccDetail);
    	
    	Assert.assertEquals(ExpaccDetail, ActaccDetail, "Both are not equal");
    	//Assert.assertTrue(false, ExpaccDetail);
    	//Assert.assertEquals(ActaccDetail, ExpaccDetail);
    	
    	
   }
}


