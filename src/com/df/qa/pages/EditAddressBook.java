package com.df.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;

public class EditAddressBook extends Testbase {
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[3]")
	WebElement editaddress;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div[1]/div[2]/a[1]")
	WebElement update;
	
	
	@FindBy(xpath="//*[@id=\"input-address-1\"]")
	WebElement address1;
	
	
	@FindBy(xpath="//*[@id=\"input-city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
    WebElement submit;
	
	@FindBy(linkText="Delete")
	WebElement delete;
	
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[3]")
	WebElement delete1;
	
	
	
	public  EditAddressBook() {
		
		PageFactory.initElements(driver, this);
		}

	public  String verifytitle() {
		return driver.getTitle();
		
	}

public EditAddressBook updatebtn(String Add1,String city1 ) {
editaddress.click();
update.click();
address1.clear();
address1.sendKeys(Add1);
city.clear();
city.sendKeys(city1);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scroll(0, 250)");
submit.click();
	
	return new EditAddressBook();
}
public EditAddressBook deletebtn(String Add1,String city1) {
	
delete1.click();
delete.click();
	return new EditAddressBook() ;
	
	
	
	
	
}
	
}


