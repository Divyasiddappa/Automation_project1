package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
@Test
public class Property_FilepracticeTest 
{
public void Test1()
{
		//step1:get the physical file
		FileInputStream fis= null;
		try {
			 fis = new FileInputStream("./src/test/resources/Commondata.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//step2:create an property object to read the dataand store the data
		Properties obj = new Properties();
		try {
			obj.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = obj.getProperty("url");
		System.out.println(url);
}
	}
	

