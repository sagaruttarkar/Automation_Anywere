package com.qa.df.informationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;

public class Bespoke_info extends Testbase {
	
	@FindBy(xpath="/html/body/footer/div[1]/div[1]/div[1]/div/ul/li[3]/a")
WebElement bespokelink;
	
	@FindBy(xpath="//*[@id=\"information-contact\"]/div[1]/div/div[1]/div/a")
WebElement lest_get_started_link;

@FindBy(xpath="//*[@id=\"input-name\"]")
WebElement bespoke_name;

@FindBy(xpath="//*[@id=\"input-email\"]")
WebElement bespoke_Email;

@FindBy(xpath="//*[@id=\"input-mobile\"]")
WebElement bespoke_phone;

@FindBy(xpath="//*[@id=\"input-enquiry\"]")
WebElement bespoke_details_of_design; 

@FindBy(xpath="//*[@id=\"bespokefrm\"]/fieldset[1]/div[4]/div/label")
WebElement bespoke_browserbtn;

@FindBy(xpath="//*[@id=\"bespoke_perms\"]")
WebElement bespoke_tems_and_condtion;



@FindBy(id="button-baspoke")
WebElement bespoke_submitbtn;



public Bespoke_info() {
	
	PageFactory.initElements(driver, this);
	
	
}
public Homepage bespoke(String B_name,String B_Email, String B_phone,String B_details) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	bespokelink.click();
	
	lest_get_started_link.click();
	
	bespoke_name.sendKeys(B_name);
	bespoke_Email.sendKeys(B_Email);
	bespoke_phone.sendKeys(B_phone);
	bespoke_details_of_design.sendKeys(B_details);
	driver.findElement(By.xpath("//*[@id=\"image\"]")).sendKeys("D:\\diamonds.JPG");

	bespoke_tems_and_condtion.click();
	bespoke_submitbtn.click();
	
	
	return new Homepage();
	
	
	
	
	
}{
	
	
	
	
}
}
