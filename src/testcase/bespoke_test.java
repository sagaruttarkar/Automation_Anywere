package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;

import com.qa.df.informationpages.Bespoke_info;

public class bespoke_test extends Testbase{
	Homepage  homepage;
	Bespoke_info bespoke_info;
	
	
public bespoke_test() {
	//demooooo 


	
		
	super();
	
}
@BeforeMethod
public void setup() {
	
	
	initialization();
	bespoke_info=new Bespoke_info();
	
}

@Test
public void  bespoke_test1() throws InterruptedException {
	
	homepage=bespoke_info.bespoke(prop.getProperty("bespoke_name"),prop.getProperty("bespoke_Email"),prop.getProperty("bespoke_phone"),prop.getProperty("bespoke_details_of_design"));	
	
	
	System.out.println("BESPOKE CONSERVATION SUCSSEFULLY !!!!!!!!");
	
}

@AfterMethod
public void tearDown(){
	driver.quit();
}

}
