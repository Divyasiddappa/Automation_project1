package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) throws IOException
	{
	// convert the  physical file into java
	FileInputStream	fis=new FileInputStream("./src/test/resources/Commondata.properties");
	// create the object for properties
	Properties property = new Properties();
	//load all the keys,load method is non static,when the details is loaded hashtable will be created and it will load all the values in the value key format
	property.load(fis);
	//to fetch the data from the file
	  String url=property.getProperty("url").trim();
	  String browser=property.getProperty("browser").trim();
	  // after exception the next statements wont be executed because the entered browser name is wrong so it doesn't go to the next line 
	  System.out.println(url);
	  System.out.println(browser);
	  
	
	
	

	}

}
