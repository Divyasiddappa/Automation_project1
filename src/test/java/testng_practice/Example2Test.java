package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2Test
{
	@Test
	public void Test3()
	{
		Reporter.log("example3 passed",true);
		System.out.println("testcase1 passed");
	}
	
	public void Test4()
	{
		Reporter.log("example4 passed",true);
		System.out.println("testcase4 passed");
	}

}
