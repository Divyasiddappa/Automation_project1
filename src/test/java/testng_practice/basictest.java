package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class basictest
{
	@BeforeClass
	public void main8test()
	{
		System.out.println("Beforeclass basic");
	}
	@AfterClass
	public void main4test()
	{
		System.out.println("Afterclass basic");
	}
	
	@Test(priority = 0)
	public void main1test()
	{
		Reporter.log("test1", true);
	}

	@Test(priority =-1)
	public void main2test()
	{
		Reporter.log("test2", true);
	}

}
