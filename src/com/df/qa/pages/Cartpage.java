package com.df.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;

public class Cartpage extends Testbase{

	@FindBy(xpath="//*[@id=\"checkout-cart\"]/div[2]/div[3]/div/div/div[1]/div[2]/div")
	WebElement securecheckoutbtn;

	
public  Cartpage() {
  
PageFactory.initElements(driver, this);
		
}	
	public Cartpage securecheckout() {
		
		 JavascriptExecutor js1 = (JavascriptExecutor)driver;
		    js1.executeScript("scroll(0, 350)");
		    
		    
		securecheckoutbtn.click();
		return new Cartpage();
		
		
		
		
	}
}