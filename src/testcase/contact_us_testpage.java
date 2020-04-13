package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.qa.df.informationpages.Contact_us_info;



public class contact_us_testpage extends Testbase {
	Homepage homepage;
	Contact_us_info contact_us_info;
	

	
	public contact_us_testpage() {
		
		
		super();
		
	}
	
	
	@BeforeMethod
	public void setup() {
		
		
		initialization();
		homepage=new Homepage();
		contact_us_info=new Contact_us_info();
		
	}
	
	
	@Test
	
	public void contact_us1() {
		
		homepage=contact_us_info.contact_us(prop.getProperty("customer_name"),prop.getProperty("customer_Email"),prop.getProperty("customer_phon"),prop.getProperty("customer_message"));
		System.out.println("CONTACT SUCSSESFULLY !!!!!!!!");
		
		
		
	}
	@AfterMethod
    
    public void tearDown(){
   		driver.quit();
   	}
	

	}