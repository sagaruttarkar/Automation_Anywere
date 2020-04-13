package com.df.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.df.qa.base.Testbase;

public class Showcasepage extends Testbase{
	@FindBy(xpath="//*[//*[@id=\"menu\"]/div[2]/div[2]/ul/li[1]/a")
	WebElement maincat;
	
	@FindBy(xpath="//*[@id=\"mob_stone_shape\"]/div/div/div[1]/div[2]/label/span/a")
   WebElement shape;
	
	@FindBy(id="carat_weight")
	WebElement carat;
	
	@FindBy(id="filter356")
	WebElement value;
	
	@FindBy(id="clarity")
	WebElement clarity;

	@FindBy(id="colour")
	WebElement colour;
	
	@FindBy(id="filter191")
     WebElement colvalue;
	
	@FindBy(id="CERT")
	WebElement certificate;
	
	@FindBy(id="filter212")
	WebElement certvalue;
	
	@FindBy(id="setting-type")
	WebElement settingtype;

	@FindBy(id="filter97")
     WebElement setvalue;
	
	
	@FindBy(id="price")
	WebElement priceslider;
	
	
	@FindBy(id="deskDiv")
	WebElement seeallbtn;
	
	@FindBy(id="price-min")
	WebElement minprice;
	
	
	@FindBy(id="price-max")
	WebElement maxprice;
	
 public Showcasepage() {
	 
	PageFactory.initElements(driver, this); 
	 
}
 
public String verifytitle() {
	
return driver.getTitle();
	
}
public Showcasepage clickonmainmenu(String minp,String maxp) throws InterruptedException {
	
	   Actions actions = new Actions(driver);
	    WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/div[2]/ul/li[1]/a"));
	    actions.moveToElement(mainMenu);   
	    
	    
	    WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"engagementrings\"]/div/div[1]/div/div[2]/ul/li[1]/a"));
	    actions.moveToElement(subMenu);
	    actions.click().build().perform();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scroll(0, 250)");
	    carat.click();
	    value.click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("scroll(0, 250)");
	    shape.click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js2 = (JavascriptExecutor)driver;
	    js2.executeScript("scroll(0, 250)");
	    colour.click();
	    colvalue.click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js3 = (JavascriptExecutor)driver;
	    js3.executeScript("scroll(0, 250)");
	    certificate.click();
	    certvalue.click();
	    Thread.sleep(3000);
	    
	    
	    JavascriptExecutor js4= (JavascriptExecutor)driver;
	    js4.executeScript("scroll(0, 250)");
	    settingtype.click();
	    setvalue.click();
	    
	  /*  priceslider.click();
	    Thread.sleep(3000);
	    
	    minprice.isDisplayed();
	    minprice.sendKeys(minp);
	   
	    Thread.sleep(5000);
	    maxprice.clear();
	    priceslider.click();
	    maxprice.sendKeys(maxp);
	    
	    Thread.sleep(3000);
	    seeallbtn.click();	
	    
	    
	   /*WebElement slider = driver.findElement(By.className("options_wd"));
	    int width=slider.getSize().getWidth();
	    Actions move = new Actions(driver);
	    org.openqa.selenium.interactions.Action action  = move.dragAndDropBy(slider, ((width*25)/100), 0).build();
	    action.perform();
	    seeallbtn.click();
	    System.out.println("Slider moved");
	*/
	    
	
	
	return new Showcasepage();
	
	
}
}