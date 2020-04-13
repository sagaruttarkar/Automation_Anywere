package com.df.qa.pages;	

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.df.qa.base.Testbase;

public class Registrationpage extends Testbase {
	
	@FindBy(xpath="//*[@id=\"logomenu\"]/div/div/div[3]/div[1]/a")
	WebElement account; 
	
	@FindBy(id="reg_signup")
	WebElement regbtn;

	@FindBy (id="title")
	 WebElement checktitle;
	
	@FindBy (id="logingender")
	WebElement checkgender;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement Fname;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement Lname;
	
	@FindBy(xpath="//*[@id=\"reg_email\"]")
	WebElement Email;
	
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement Password;
	
	
	@FindBy(id="checkboxagree")
	WebElement agree;
	
	
	
	@FindBy(xpath="//*[@id=\"button-register\"]")
	WebElement submitbtn;
	
	

	
	
	public Registrationpage() {
		PageFactory.initElements(driver, this);		// TODO Auto-generated constructor stub
	}

	
	
	

public  MyAccountpage userdetails (String fname,String rlname,String remail,String rpass) throws InterruptedException {
	
	account.click();
	Thread.sleep(2000);
	regbtn.click();
	
	Thread.sleep(2000);
	
	
	checktitle.click();
      Select drop = new Select(checktitle);
      drop.selectByIndex(2);  
	checkgender.click();
	Select drop1=new Select(checkgender);
	drop1.selectByIndex(2);
	Fname.sendKeys(fname);
	Lname.sendKeys(rlname);
	Email.sendKeys(remail);
	Password.sendKeys(rpass);
	agree.click();
	submitbtn.click();
	return new MyAccountpage();
	
}



		}
		
	


