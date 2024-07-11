package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SFAccCreationPage extends BaseClass{
	
	@FindBy(xpath="(//input[@title=\"Save\"])[1]") private WebElement SaveBtn;
	@FindBy(xpath="//label[contains(text(),\"Account Name\")]//following::input[1]") private WebElement AccName;
	@FindBy(xpath="//label[contains(text(),\"Account Number\")]//following::input[1]") private WebElement AccNum;
	
	
	public SFAccCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
    public SFAccDetailPage createAcc() throws InterruptedException {
    	Action.type(AccName, "Test55555");
    	Action.type(AccNum, "786123555");
    	Action.click(driver, SaveBtn);
    	Thread.sleep(3000);
    	return new SFAccDetailPage();
    	
    }
}
