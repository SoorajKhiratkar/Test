package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationTest {
	@AfterSuite
	public void test1()
	{
		System.out.println("test1");
	}
    @AfterTest
    public void test2()
    {
    	System.out.println("test2");
    }
    @AfterClass
    public void test3()
    {
    	System.out.println("test3");
    }
    @AfterMethod
    public void test4()
    {
    	System.out.println("test4");
    }
    @Test
    public void test5()
    {
    	System.out.println("test5");
    }
    @BeforeSuite
    public void test6()
    {
    	System.out.println("test6");
    }
    @BeforeTest
    public void test7() 
    {
    	System.out.println("test7");
    }
   @BeforeClass
   public void test8() 
   {
   	System.out.println("test8");
   }
   @BeforeMethod
   public void test9() 
   {
   	System.out.println("test9");
   }
}
