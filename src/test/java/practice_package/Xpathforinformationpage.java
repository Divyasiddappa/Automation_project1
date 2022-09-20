package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.zurich.objectrepository.Common_page;
import org.zurich.objectrepository.Loginpage;

import generalUtility.ExcelUtility;
import generalUtility.Iconstants;
import generalUtility.Textfieldnames;
import generalUtility.WebdriverUtility;

public class Xpathforinformationpage {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub//CLIENTS INFORMATION
		//h1[@class='page-head-line']/ancestor::div[@class='col-md-12']//h1
		WebDriver driver;
		WebdriverUtility driver1 = new WebdriverUtility();
		driver = driver1.starttheapplication("chrome", 10, Iconstants.URL);
		ExcelUtility excel = new ExcelUtility();
		String Username = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","username");
		String password = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					Textfieldnames.Password);
		Loginpage login = new Loginpage(driver);
		login.user(Username, password);
		Common_page common = new Common_page(driver);
		common.clickonclient();
		WebElement s1 = driver.findElement(By.xpath("//h1[@class='page-head-line']/ancestor::div[@class='col-md-12']//h1"));
		String n1=s1.getText();
		System.out.println("id is = " + n1);
		
		
	}
	

}
