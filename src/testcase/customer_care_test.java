package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.qa.df.informationpages.Customercare_info;

public class customer_care_test extends Testbase {
	
	
	Homepage homepage;
     Customercare_info customercare_info;
     
     
     public customer_care_test() {
    	 
    	 
    	 super();
    	 
     }
     
     @BeforeMethod
public void setup() {
	
	initialization();
	customercare_info =new Customercare_info();
	
}
     @Test
     
     public void Custmer_care_test() {
    	 
    	 
    	homepage=customercare_info.customer_care(prop.getProperty("cust_name"),prop.getProperty("cust_email"),prop.getProperty("cust_phon")
    			, prop.getProperty("cust_message"));
     }
     
     @AfterMethod
     
     public void tearDown(){
    		driver.quit();
    	}
}
