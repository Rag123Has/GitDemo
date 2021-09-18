package Test1;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test
	public void SeventhClass()
	{
		System.out.println("7th");
	}
	

	@Test
	public void EightClass()
	{
		System.out.println("8th");
	}
	
	@Test(groups={"Smoke"})
	public void NinthClass()
	{
		System.out.println("9th");
	}
}
