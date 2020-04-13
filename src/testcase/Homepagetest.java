/* author name sagar uttarkat 
 * 
 */



package testcase;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.df.qa.util.TestUtil;

public class Homepagetest  extends Testbase {
Homepage homepage;
TestUtil testutil;

public  Homepagetest() {

	super(); 
	
}

@BeforeMethod

public void setup() {
	
	initialization();
	homepage=new Homepage();

		
}

@Test(priority=3) //to test homepage tittle 
public void verifytitlehome() {
	
String title=	homepage.verifyHomePageTitle();
	Assert.assertEquals(title,"Buy Diamond Engagement, Wedding Rings, Bracelets & Pendants Online UK - Diamonds Factory");
}

@Test(priority=4)// to verify hero banner "shop now button"
public void shopnowbtn() {
	

	homepage.shopnowbtn();
}

@Test(priority=1)
public void bookandappllink() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,750)");
	homepage.bookandappoclick();
	
	
}

@Test(priority=2)// to check search textfield
public void searchfiels() {
	
	homepage.searchbox(prop.getProperty("searchkeyword"));
	
}


@AfterMethod
public void teardDown() {
	
	driver.close();
	
	
}

}