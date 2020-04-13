package com.df.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.df.qa.base.Testbase;

public class Productpage extends Testbase  {
	
	@FindBy(name="search")
	WebElement search;
	 
	@FindBy(xpath="//*[@id=\"normalimg12\"]")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"31\"]")
	WebElement metal;
	
	@FindBy(id="st_ring_size")
	WebElement ringsize;
	
	
	@FindBy(id="132")
	WebElement shape;
	
	@FindBy(xpath="//*[@id=\"207\"]")
	WebElement carat;
	
	@FindBy(xpath="//*[@id=\"140\"]")
	WebElement clearity;
	
	@FindBy(xpath="//*[@id=\"150\"]")
	WebElement colour;
	
	@FindBy(xpath="//*[@id=\"161\"]")
	WebElement certificate;
	
	
	@FindBy(xpath="//*[@id=\"chooseSpecificBtn\"]")
	WebElement choosediamond;
	
	@FindBy(xpath="//*[@id=\"price_row_18178\"]]")
	WebElement selectdiamond;
	
	@FindBy(xpath="//*[@id=\"addtobag_btn\"]")
	WebElement AddtoBag;
	
	public Productpage() {
		PageFactory.initElements(driver, this);		// TODO Auto-generated constructor stub
	}

public Productpage filtersdetails(String keyword) throws InterruptedException {
	search.sendKeys(keyword);  
	 JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("scroll(0, 400)");
	    
	product.click();
	metal.click();
	
	
	Select size=new Select(ringsize);
	size.selectByValue("idk");
	Thread.sleep(2000);
	 JavascriptExecutor js2= (JavascriptExecutor)driver;
	    js2.executeScript("scroll(0, 250)");
	
	//shape.click();
	carat.click();
	Thread.sleep(2000);
	clearity.click();
	Thread.sleep(2000);
	colour.click();
	Thread.sleep(2000);
	certificate.click();
	Thread.sleep(2000);
	choosediamond.click();
	 JavascriptExecutor js3= (JavascriptExecutor)driver;
	    js3.executeScript("scroll(0, 500)");
	    
	    selectdiamond.click();
	    Thread.sleep(2000);
	    
	    JavascriptExecutor js4= (JavascriptExecutor)driver;
	    js4.executeScript("scroll(0,800)");
	    AddtoBag.click();
	
	
	return new Productpage();
	
	
	
	
	
	
}
}
