package com.df.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;

public class VisitourShowroom extends Testbase{
	
	@FindBy(linkText = "Book an Appointment")
	WebElement bookandappo;
	
	@FindBy(xpath="//*[@id=\"tab_london\"]/div[2]/div[2]/div[4]/a")
	WebElement viewingbtn;
	
	@FindBy(id="loc_container1")
	WebElement loc1_london;
	
	@FindBy(xpath="//*[@id=\"serviceli\"]/li[1]")
	WebElement viewing_serivice;
	
	@FindBy(xpath="//*[@id=\"datepicker\"]/div/ul/li[1]/div/div[1]/table/tbody/tr[3]/td[5]")
	WebElement caldate;
	
	
	@FindBy(xpath="//*[@id=\"timings\"]/li[4]/a/div[1]/p")
	WebElement time;
	
	
	@FindBy(xpath="//*[@id=\"view_name\"]")
    WebElement appname;
	
	@FindBy(xpath="//*[@id=\"view_email\"]")
     WebElement appEmail;
	
	@FindBy(xpath="//*[@id=\"view_mobile\"]")
    WebElement appmobo;
	
	@FindBy(xpath="//*[@id=\"appt_enquiry\"]")
    WebElement appenquiry;
	
	@FindBy(xpath="//*[@id=\"appt_perms\"]")
	WebElement appcheckbtn;
	
	@FindBy(xpath="//*[@id=\"button-viewing\"]")
	WebElement appconfrimbtn;
	
	
	public VisitourShowroom(){
		PageFactory.initElements(driver, this);
	}
	

	// Action 
	public void bookandapplink() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		bookandappo.click();
			}
public void viewingpageclick() throws InterruptedException {
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	viewingbtn.click();	
}
public void locationclick() {
	
	loc1_london.click();	
	viewing_serivice.click();
	caldate.click();
	
}


public void jquerycalender() throws InterruptedException {
	
	caldate.click();
	
    JavascriptExecutor js1= (JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,500)");
    time.click();
	
	appname.sendKeys("sagar");
	appEmail.sendKeys("sagar@diamondsfactory.in");
	appmobo.sendKeys("9870336596");
	appenquiry.sendKeys("hii am teater hii  am tester");
	appcheckbtn.click();
	appconfrimbtn.click();
	
	
	
	
	
	
}
}
