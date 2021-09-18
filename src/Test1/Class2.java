package Test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups={"Smoke"})
	public void FourthClass()
	{
		System.out.println("4th");
	}
	
	@BeforeClass
	public void BeforeClass2()
	{
		System.out.println("ru me before class");
	}
	@AfterClass
	public void AfterClass2()
	{
		System.out.println("ru me after class");
	}
 
	@Parameters({"URL","Key"})
	@Test
	public void FiveClass(String a,String c)
	{
		System.out.println("5th");
		System.out.println(a);
		System.out.println(c);
	}
	
	@Test
	public void SixthClass()
	{
		System.out.println("6th");
	}
}
