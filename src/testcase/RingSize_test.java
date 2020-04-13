package testcase;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.qa.df.informationpages.Ringsize_guide_info;

public class RingSize_test extends Testbase {
	
	 Homepage homepage;
	Ringsize_guide_info ring_size_info;

	
	
	public RingSize_test() {
		
		
		super();
	}
@BeforeMethod
public void setup() {
	
	
	
	initialization();
	ring_size_info=new Ringsize_guide_info();
	homepage=new Homepage();
	
	
}
@Test
public void RingSize_test1() throws InterruptedException {
	
	homepage=ring_size_info.Ring_size(prop.getProperty("R_fname"),
			prop.getProperty("R_lname"),prop.getProperty("R_add1"),prop.getProperty("R_add2"),
			prop.getProperty("R_city"),prop.getProperty("R_pincode"),prop.getProperty("R_mobileno")
			,prop.getProperty("R_email"));
	
	
	
	
}
/*@AfterMethod

public void tearDown(){
		driver.quit();
	}*/
}