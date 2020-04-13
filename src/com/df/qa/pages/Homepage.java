package com.df.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;

public class Homepage extends Testbase {

	@FindBy(className = "item-img")
	@CacheLookup
	WebElement homebannersale;
	
	@FindBy(name="Engagement Rings")
	WebElement maincat;

	@FindBy(linkText = "Book an Appointment")
	WebElement bookandappo;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div/div/a/div[2]/button")
	WebElement shopnowbtn;
	
	@FindBy(xpath="//*[@id=\"button-search-head\"]")
	WebElement searchbox;



	// Initializing the Page Objects:
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
		
		
		
		
	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	

	
	public  void shopnowbtn() {
		
		
		      shopnowbtn.click();
		
	}
	public void bookandappoclick() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		bookandappo.click();
		return;
	}

	public boolean verifyhomebannersale() {
		// TODO Auto-generated method stub
		return homebannersale.isDisplayed();
	}
	
	public void searchbox(String searchkeyword) {
		
		
		searchbox.sendKeys(searchkeyword);
		
	}
		
		
	}
	