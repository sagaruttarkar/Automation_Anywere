package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.df.qa.pages.Registrationpage;
import com.df.qa.pages.Showcasepage;
import com.df.qa.util.TestUtil;

public class Registrationpagetest extends Testbase {
	
	Homepage homepage;
	Showcasepage showcasepage;
	Registrationpage registationpage;
	TestUtil testutil;

	
	public Registrationpagetest() {
		
		
		super();
	}
@BeforeMethod
public void setup() {
	
	
	initialization();
	homepage=new Homepage();
	showcasepage=new Showcasepage();
	registationpage=new Registrationpage();
	
	
}
@Test
public void registrationprocess() throws InterruptedException {
	
	registationpage.userdetails(prop.getProperty("fname"), prop.getProperty("rlname"), prop.getProperty("remail"),prop.getProperty("rpass"));
	
	System.out.println("SUCSSEFULLY REGITER !!!!!!!!!!!");
	
}





@AfterMethod
public void tearDown() {
	
	driver.close();
	
	
}
}



