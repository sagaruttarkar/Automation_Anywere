package com.qa.df.informationpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;

public class Customercare_info extends Testbase{
	
	@FindBy(xpath="/html/body/footer/div[1]/div[1]/div[2]/div/ul/li[1]/a")
	WebElement custmoerpage_link;
	
	@FindBy(xpath="//*[@id=\"input-name\"]")
	WebElement customer_name;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement customer_Email;
	
	@FindBy(xpath="//*[@id=\"input-mobile\"]")
	WebElement customer_phon;
	
	@FindBy(xpath="//*[@id=\"input-enquiry\"]")
	WebElement customer_message;
	
	@FindBy(xpath="//*[@id=\"contact_perms\"]")
	WebElement customer_tnccheck;
	
	@FindBy(xpath="//*[@id=\"bt_contactUS\"]")
	WebElement submitbtn;


	
	public Customercare_info() {
		
		PageFactory.initElements(driver,this);
		
		}

public Homepage customer_care(String cust_name,String cust_email,String cust_phon,String cust_message) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	custmoerpage_link.click();
	customer_name.sendKeys(cust_name);
	customer_Email.sendKeys(cust_email);	
	customer_phon.sendKeys(cust_phon);
	customer_message.sendKeys(cust_message);
	customer_tnccheck.click();
	submitbtn.click();
	
	
	
	
	
	return new Homepage();
	
	
	
}

}
