package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.df.qa.base.Testbase;
import com.df.qa.pages.Homepage;
import com.df.qa.pages.Loginpage;

public class Loginpagetest extends Testbase{

	Loginpage loginpage;
	Homepage  homepage;
	

public Loginpagetest() {
	
	
	super();
	
}
@BeforeMethod

public void setup() {
	
	
	initialization();
	loginpage=new Loginpage();
	
}
@Test(priority=2)

public void verifytitle() {
	
String title=loginpage.validateLoginPageTitle();
Assert.assertEquals(title,"Buy Diamond Engagement, Wedding Rings, Bracelets & Pendants Online UK - Diamonds Factory");
}
/*@Test(priority=1)


public void verifyloggo() {
	
	boolean flag=loginpage.validatedflogo();
	
	Assert.assertTrue(flag);
}
*/
@Test
public void logintest() throws InterruptedException {
	
homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password1"));
System.out.println("SUCSSEFULLY LOGIN IN SYSYTEM !!!!!!!!!!!");
	
}


@AfterMethod
public void tearDown(){
	driver.quit();
}
}
