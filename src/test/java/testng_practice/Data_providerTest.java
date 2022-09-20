package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generalUtility.ExcelUtility;
import generalUtility.Iconstants;

public class Data_providerTest {

	@BeforeClass
	public void main1Test()
	{
		System.out.println("Before_class");
	}
	
	@AfterClass
	public void main2Test()
	{
		System.out.println("After_class");
	}
	
	@Test(dataProvider="abcd")
	public void main3Test(String un, String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
		System.out.println("this is thread_id"+Thread.currentThread().getId());
	}
	@Test
	public void main4Test()
	{
		Reporter.log("Test2",true);
	}
	
	@DataProvider(name="abcd",parallel=true)
	public Object[][] getdata()
	{
		ExcelUtility excel = new ExcelUtility();
		excel.opentheexcelfile(Iconstants.EXCEL_PATH);
		String[][] ex = excel.gettwodimensionaldata("dataprovider1");
		return ex;
	}
}
