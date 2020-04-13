package com.df.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.df.qa.base.Testbase;

public class Loginpage extends Testbase{
	
	//Page Factory - OR:
	
	
	@FindBy(xpath="//*[@id=\"logomenu\"]/div/div/div[3]/div[1]/a")
	WebElement account; 
	
	@FindBy(xpath="//*[@id=\"login_email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"button-login\"]")
	WebElement signin;
	
	//@FindBy(linkText="Edit Information")
	//WebElement editlink;
	
	@FindBy(id="logo")
	WebElement dflogo;
	
	//Initializing the Page Objects:
	
	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:	
	
	public Loginpage clickaccount() {
		
		account.click();
	return new Loginpage();
		
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validatedflogo(){
		return dflogo.isDisplayed();
	}
	
	public Homepage login(String un, String pwd) throws InterruptedException{
		
		account.click(); 
		Thread.sleep(2000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		signin.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", signin);
		    	
		return new Homepage();
	}
	
}
