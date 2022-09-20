package practiceutility;

import generalUtility.FileUtility;
import generalUtility.Iconstants;

public class Property_file 
{

	public static void main(String[] args) 
	{
		//FileInputStream	fis=new FileInputStream("./src/test/resources/Commondata.properties");
		//Properties property = new Properties();
		//property.load(fis);
		 String url=new FileUtility().propertyfile(Iconstants.PROPERTY_FILE, "url");
		 String browser =new FileUtility().propertyfile(Iconstants.PROPERTY_FILE, "browser");
		  System.out.println(url);
		  System.out.println(browser);
	}

}
