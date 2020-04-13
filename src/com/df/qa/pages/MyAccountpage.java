package com.df.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;

public class MyAccountpage extends Testbase{
	
	@FindBy(id="input-telephone")
	WebElement mobileno;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	WebElement updatebtn;
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[2]")
	WebElement editpass;
	
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement newpassword;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	WebElement updatebtn1;

	@FindBy(id="cookie-btn")
	WebElement cookiesbtn;

public MyAccountpage() {
	
	PageFactory.initElements(driver, this);
	
}

public String verifytitle() {
	
	
	return driver.getTitle();
	
	}

public MyAccountpage  mobileno(String mno) {
mobileno.clear();	
mobileno.sendKeys(mno);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scroll(0, 250)");
updatebtn.click();
return new MyAccountpage();
}


public ChangePassword forgetpassword(String pass,String newpass) {
	editpass.click();
	password.sendKeys(pass);
	newpassword.sendKeys(newpass);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scroll(0, 250)");
	//updatebtn.click();
	
	return new ChangePassword();
	
	
	
	
	
}
}