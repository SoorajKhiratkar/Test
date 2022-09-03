package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashBoardPageTest extends TestBase {
	
	DashboardPage dash;
	LoginPage login;
	@BeforeMethod(groups= {"Sanity","Regression","Functional"})
	public void setup() throws Throwable 
	{
		initialization();
		login=new LoginPage();
		dash =new DashboardPage();
		login.loginZerodhaApp();
	}
	@Test(groups="Sanity")
	public void verifyNicknameTest() throws Throwable
	{
		String value = dash.verifyNickname();
		System.out.println(value);	
	}
	@Test(groups="Sanity")
	public void verifyuserIdTest() throws Throwable
	{
		String value = dash.verifyUserId();
		System.out.println(value);
	}
	@Test(groups= {"Regression","Sanity"})
	public void verifyemailIdtest() throws Throwable
	{
		String value = dash.verifyUsername();
		System.out.println(value);
	}
	
	@Test(groups="Functional")
	public void verifyUsernameTest() throws Throwable 
	{
		String value = dash.verifyUsername();
		System.out.println(value);
	}
	@Test(enabled=false)
	public void verifyactivateBtnLabelTest() throws Throwable
	{
		String value = dash.verifyactivateBtnLabel();
		System.out.println(value);
	}
	
	@AfterMethod(groups= {"Sanity","Regression","Functional"})
	public void exit()
	{
		driver.close();
	}

}
