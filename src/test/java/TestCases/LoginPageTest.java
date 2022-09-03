package TestCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;


public class LoginPageTest extends TestBase {
	LoginPage login;
	
	@BeforeMethod(groups= {"Sanity","Regression"})
	public void setup() throws Exception 
	{
		initialization();
		login=new LoginPage();
		
	}
	
	@Test(priority=-1,groups="Sanity")
	public void verifyAppTitleTest()
	{
		String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actTitle =login.verifyAppTitle();
		Assert.assertEquals(actTitle, expTitle,"Title is Wrong");
		System.out.println("Check Print is done");
	}
	
	@Test(/*dependsOnMethods="verifyAppTitleTest",*/priority=1,invocationCount=1)
	public void verifyKiteLabelTest()
	{
		String actLabel=login.verifyKiteLabel();
		Assert.assertEquals(actLabel, "Login to Kite");
		System.out.println("Check login to kite label");
	}
	
	@Test(enabled=true,priority=2)
	public void verifyKiteLogoTest()
	{
		boolean result=login.verifyKiteLogo();
		Assert.assertEquals(result, true);
		//Assert.assertTrue(false);
		///Assert.assertFalse(false);
		System.out.println("Kite Logo is print");
	}
	@Test(enabled=true,priority=3)
	public void verifyZerothaLogoTest() throws Throwable
	{
		
		boolean result = login.verifyZerothaLogo();
		Assert.assertEquals(result, true);
		System.out.println("Zerotha Logo print");
		
	}
	@Test(enabled=true)
	public void loginZerothaAppTest() throws Throwable
	{
		login.loginZerodhaApp();
	}
	@AfterMethod(groups="Sanity")
	public void exit()
	{
		driver.close();
	}
}
