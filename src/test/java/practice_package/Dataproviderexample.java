package practice_package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample {
	@Test(dataProvider ="data")
public void cityTest(String city, int pincode)
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("city"+city);
	System.out.println("pincode"+pincode);
	
}
	@DataProvider( name="data")
public Object[][] getdata()
{
	Object[][] obj = new Object[3][2];
	obj[0][0]="Bangalore";
	obj[0][1]="560010";
	obj[1][0]="Mysore";
	obj[1][1]="570010";
	obj[2][0]="udupi";
	obj[2][1]="570017";
	return obj;
	
}
	
	//changed by engg-1
	
	
	
	
}
