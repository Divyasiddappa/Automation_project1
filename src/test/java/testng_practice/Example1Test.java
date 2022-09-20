package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1Test 
{

	@Test
	public void Test1()
	{
		Reporter.log("example1 passed",true);
		System.out.println("testcase1 passed");
	}
	
	public void Test2()
	{
		Reporter.log("example2 passed",true);
		System.out.println("testcase2 passed");
	}

	
	
}
