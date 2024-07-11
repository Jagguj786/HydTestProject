package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SFHomePage extends BaseClass{
	
	@FindBy(xpath="//li[@id=\"Account_Tab\"]") private WebElement AccTab;
	@FindBy(xpath="//input[@title=\"New\"]") private WebElement NewBtn;
	@FindBy(xpath="//input[@id=\"phSearchInput\"]") private WebElement Gsearch;
	@FindBy(xpath="//div[@id=\"searchButtonContainer\"]") private WebElement Search;
	//div[@id="searchButtonContainer"]
	
	
	public SFHomePage() {
		PageFactory.initElements(driver, this);
	}
	
    public void clickAccTab() throws InterruptedException {
    	
    	Action.click(driver, AccTab);
    	Thread.sleep(3000);
    }
    
    public SFAccCreationPage clickNew() throws InterruptedException {
    	
    	Action.click(driver, NewBtn);
    	Thread.sleep(3000);
    	return new SFAccCreationPage();
    }
    
    public void golbalSearchtext(String num) {
    	Action.type(Gsearch, num);
    }
    
    public void Search() throws InterruptedException {
    	Thread.sleep(5000);
    	Action.click(driver, Search);
    	Thread.sleep(3000);
    }
    
}
