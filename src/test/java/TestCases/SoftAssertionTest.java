package TestCases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	@Test
	public void test1()
	{
		SoftAssert s =new SoftAssert();
		System.out.println("Excution of test1 started");
		s.assertEquals(200,201, "Check if it failed");
		System.out.println("Checking first assertion");
		s.assertEquals("Java","Java","Check if it failed");
		System.out.println("Execution of test1 ended");
	    s.assertAll();
	}
	@Test
	public void test2() 
	{
	   System.out.println("Excution of test1 started");
	   Assert.assertEquals(200,201, "Check if it failed");
	   System.out.println("Checking first assertion");
	   Assert.assertEquals("Java","Java","Check if it failed");
	   System.out.println("Execution of test2 ended");
	}
}
