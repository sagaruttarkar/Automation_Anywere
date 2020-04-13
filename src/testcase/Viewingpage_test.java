package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.df.qa.pages.VisitourShowroom;
import com.df.qa.util.TestUtil;

public class Viewingpage_test extends Testbase {

    VisitourShowroom visitourshwroom;
    Homepage homepage;
    TestUtil testutil;
    
    public Viewingpage_test () {
    	
    	super();
    	
    }
    @BeforeMethod

    public void setup() {
    	
    	initialization();
    	visitourshwroom=new VisitourShowroom();

    		
    }
    
  /*  @Test(priority=3)
    
    public void bookandappllink() throws InterruptedException {
    
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,750)");
    	visitourshwroom.bookandapplink();
    	
    	}
    @Test(priority=2)
 public void viewingpage() throws InterruptedException{
    	
 
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,750)");
    	visitourshwroom.bookandapplink();
    	
    	
    	JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,750)");
    	visitourshwroom.viewingpageclick();
    	visitourshwroom.locationclick();
    	 }
*/    
    @Test(priority=1)
    public void calender() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,750)");
    	visitourshwroom.bookandapplink();
    	
     	JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,750)");
    	
    	visitourshwroom.viewingpageclick();
         visitourshwroom.locationclick();
    	JavascriptExecutor js2= (JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,750)");
        visitourshwroom.jquerycalender();
        
        System.out.println("APPOINTMENT BOOK SUCCESFULLY !!!!!!!!!");
    	
    
    	
    
   }
    
    @AfterMethod
 
    public void teardDown() {
    	
    	driver.close();
    	
    	
    }




}
