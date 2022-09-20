package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingtest 
{
	@BeforeSuite
	public void beforesuittest() 
	{
	Reporter.log("beforesuite",true);	
	}
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("beforeTest", true);
	}
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("beforeclass", true);
	}
	@AfterClass
	public void main4test()
	{
		System.out.println("Afterclass basic");
	}
	@Test
	public void nominee()
	{
		Reporter.log("nominee to be clicked", true);
	}
	@Test(priority=1)
	public void addnominee()
	{
		Reporter.log("nominee to be added", true);
	}
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("aftermethod",true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("afterclass", true);
	}
	@AfterTest
	public void aftertest()
	{
		Reporter.log("afterTest", true);
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("aftersuite", true);
	}
	
	
	
	
}
