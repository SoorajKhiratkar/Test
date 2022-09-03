package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class CaptureScreenshot extends TestBase {
LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception 
	{
		initialization();
		login=new LoginPage();
		
	}
	
	@Test
	public void verifyAppTitleTest()
	{
		String expTitle = "1Kite - Zerodha's fast and elegant flagship trading platform";
		String actTitle =login.verifyAppTitle();
		Assert.assertEquals(actTitle, expTitle,"Title is Wrong");
		System.out.println("Check Print is done");
	}
	@AfterMethod
	public void exit(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE ==it.getStatus())
    {
			captureScreenshotFailedTC(driver);
    }
		driver.close();
	}

}
