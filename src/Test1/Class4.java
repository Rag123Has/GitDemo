package Test1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Class4 {
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Test before Method class4 ");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Test After Method class4 ");
	}
	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("Test before Suit ");
	}
	@AfterSuite
	public void 	AfterSuit()
	{
		System.out.println("Test AfterSuit ");
	}
	@BeforeTest
	public void BeforeClass4()
	{
		System.out.println("Test before class4 ");
	}
	@Test(groups={"Smoke"})
	public void TenthClass()
	{
		System.out.println("10th");
	}
	

	@Test
	public void EleventhClass()
	{
		System.out.println("11th");
	}
	
	@Test
	public void TwelveClass()
	{
		System.out.println("12th");
	}
	@AfterTest
	public void AfterClass4()
	{
		System.out.println("Test before class4 ");
	}
}
