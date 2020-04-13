package com.qa.df.informationpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;



public class Ringsize_guide_info extends Testbase{
	
	
	@FindBy(xpath="/html/body/footer/div[1]/div[1]/div[3]/div/ul/li[6]/a")
	
	WebElement Rsize_link;
	
	@FindBy(xpath="//*[@id=\"customername\"]")
	
	WebElement Rsize_firstname;


	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	
	WebElement Rsize_lastname;


	@FindBy(xpath="//*[@id=\"input-address\"]")
	
	WebElement Rsize_Address_line1;

	@FindBy(xpath="//*[@id=\"input-address_2\"]")
	
	WebElement Rsize_Address_line2;

	@FindBy(xpath="//*[@id=\"input-city\"]")
	
	WebElement Rsize_city;
	
	@FindBy(xpath="//*[@id=\"input-pincode\"]")
	
	WebElement Rsize_pincode;

	@FindBy(xpath="//*[@id=\"input-mobile\"]")
	
	WebElement Rsize_mobile;

	@FindBy(xpath="//*[@id=\"customeremail\"]")
	
	WebElement Rsize_customeremail;
	
	@FindBy(name="emailsubscribe")
	
	WebElement sign_me_up;
	
	
	@FindBy(xpath="//*[@id=\"contact_perms\"]")
	
	WebElement sign_me_up1;
	
	
	@FindBy(xpath="//*[@id=\"button-ringsize\"]")
	
	WebElement orderlink_size;
	

	
	public Ringsize_guide_info() {
		
		PageFactory.initElements(driver, this);
		
	}

public   Homepage Ring_size(String R_fname,String R_lname,String R_add1,String R_add2,String R_city,String R_pincode,String R_mobileno, String R_email ) throws InterruptedException {
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	
	js1.executeScript("window.scrollBy(0,500)");
	
	Rsize_link.click();
	Rsize_firstname.sendKeys(R_fname);
	Rsize_lastname.sendKeys(R_lname);
	Rsize_Address_line1.sendKeys(R_add1);
	Rsize_Address_line2.sendKeys(R_add2);
	Rsize_city.sendKeys(R_city);
	Rsize_pincode.sendKeys(R_pincode);
	Rsize_mobile.sendKeys(R_mobileno);
	Rsize_customeremail.sendKeys(R_email);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	sign_me_up.click();
	sign_me_up1.click();
	orderlink_size.click();
	return new Homepage();
	
	
	
	
}


}