package Test1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void FirstClass()
	{
		System.out.println("1st");
	}
	
    
	@Test(dataProvider="getData")
	public void SecondClass(String username,String password)
	{
		System.out.println("2nd");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups={"Smoke"})
	public void ThirdClass()
	{
		System.out.println("3rd");
		Assert.assertTrue(false);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a= new Object[3][2];
		a[0][0]="FirstUserName";
		a[0][1]="FirstPassword";
		a[1][0]="SecondUsername";
		a[1][1]="SecongPassword";
		a[2][0]="ThirdUsername";
		a[2][1]="ThirdPassword";

return a;
	}
}
