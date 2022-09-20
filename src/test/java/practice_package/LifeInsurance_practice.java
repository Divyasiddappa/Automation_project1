package practice_package;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import generalUtility.ExcelUtility;
import generalUtility.Iconstants;
import generalUtility.WebdriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LifeInsurance_practice 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// get the data from excel and then using that data it should start the application
		String url1= new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",1,1);
		String browser = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", 1,2);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		new WebdriverUtility().starttheapplication(browser,10, url1);
		String name = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",5,1);
		driver.findElement(By.name("name")).sendKeys(name);
		String image = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",6,1);
		driver.findElement(By.xpath("//input[@name='fileToUpload']")).sendKeys(image);
		String sex = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",7,1);
		driver.findElement(By.name("sex")).sendKeys(sex);
		String birthdate = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",8,1);
		driver.findElement(By.name("birth_date")).sendKeys(birthdate + "");
		String maritalstatus = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",9,1);
		driver.findElement(By.name("maritial_status")).sendKeys(maritalstatus);
		String nid = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",10,1);
		driver.findElement(By.name("nid")).sendKeys(nid);
		String phonenumber = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",11,1);
		driver.findElement(By.name("phone")).sendKeys(phonenumber + "");
		String address = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",12,1);
		driver.findElement(By.name("address")).sendKeys(address);
		String nominee_name = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",14,1);
		driver.findElement(By.name("nominee_name")).sendKeys(nominee_name + "");
		String nominee_sex = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",15,1);
		driver.findElement(By.name("nominee_sex")).sendKeys(nominee_sex);
		String birthdate1 = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",16,1);
		driver.findElement(By.name("nominee_birth_date")).sendKeys(birthdate1);
		String NID1 = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",17,1);
		driver.findElement(By.name("nominee_nid")).sendKeys(NID1);
		String RELATIONSHIP = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",18,1);
		driver.findElement(By.name("nominee_relationship")).sendKeys(RELATIONSHIP);
		String priority = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",20,1);
		driver.findElement(By.name("priority")).sendKeys(priority);
		String phonenumber1 = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",21,1);
		driver.findElement(By.name("nominee_phone")).sendKeys(phonenumber1 + "");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[text()='CLIENTS'])")).click();
		String url2 = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",22,1);
		new WebdriverUtility().closethebrowser();
		String tbele1 = driver.findElement(By.xpath("//tbody//tr[last()]//td[1]")).getText();
		String tbele2 = driver.findElement(By.xpath("//tbody//tr[last()]//td[2]")).getText();
		String tbele3 = driver.findElement(By.xpath("//tbody//tr[last()]//td[3]")).getText();
		String tbele4 = driver.findElement(By.xpath("//tbody//tr[last()]//td[4]")).getText();
		String tbele5 = driver.findElement(By.xpath("//tbody//tr[last()]//td[5]")).getText();
		String tbele6 = driver.findElement(By.xpath("//tbody//tr[last()]//td[6]")).getText();
		System.out.print(tbele1);
		System.out.print(tbele2);
		System.out.print(tbele3);
		System.out.print(tbele4);
		System.out.print(tbele5);
		System.out.print(tbele6);
		String[] ar = { "tbele1", "tbele2", "tbele3", "tbele4", "tbele5", "tbele6" };
		// double[] d1 = {"tbele1",};
		String[] ar1 = { "user1", "name", "birthdate", "nid", "phonenumber", "address" };
		// double[] d2 = {};
		// if(checkEquality)
		ArrayList<String> ar2 = new ArrayList<String>();
		for (int i = 0; i <= ar1.length; i++) {
			if (!Arrays.asList(ar).contains(ar1[i])) {
				ar2.add(ar1[i]);
				System.out.println("the table is compared and same as the excel details");
				break;
			} else {
				System.out.println("the table is compared but the details are not same as the excel details");
				break;
			}
		}
		WebElement ele8 = driver.findElement(By.xpath("//a[text()='Aegon Life']"));
		new WebdriverUtility().mousehoveraction(driver, ele8);
		ele8.click();
		WebElement ele9 = driver.findElement(By.name("key"));
		new WebdriverUtility().mousehoveraction(driver, ele9);
		ele9.sendKeys(name);
		driver.findElement(By.xpath("//input[@class='searchBtn']")).click();
		String tb1ele1 = driver.findElement(By.xpath("//tbody//tr//td[1]")).getText();
		String tb1ele2 = driver.findElement(By.xpath("//tbody//tr//td[2]")).getText();
		String tb1ele3 = driver.findElement(By.xpath("//tbody//tr//td[3]")).getText();
		String tb1ele4 = driver.findElement(By.xpath("//tbody//tr//td[4]")).getText();
		String tb1ele5 = driver.findElement(By.xpath("///tbody//tr//td[5]")).getText();
		String tb1ele6 = driver.findElement(By.xpath("//tbody//tr//td[6]")).getText();
		String[] ar3 = { "tb1ele1", "tb1ele2", "tb1ele3", "tb1ele4", "tb1ele5", "tb1ele6" };
		ArrayList<String> ar4 = new ArrayList<String>();
		for (int i = 0; i <= ar3.length; i++) {
			if (!Arrays.asList(ar).contains(ar3[i])) {
				ar4.add(ar3[i]);
				System.out.println("the table is compared and same as the excel details");
				break;
			} else {
				System.out.println("the table is compared but the details are not same as the excel details");
				break;
			}
		}
		driver.findElement(By.xpath("//tbody//tr//td[.='" + name + "']/following-sibling::td//a")).click();
		driver.findElement(By.xpath("//a[text()='Edit Client']")).click();
		String name1 = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",5,2);
		driver.findElement(By.name("name")).sendKeys(name1);
		driver.findElement(By.xpath("//input[@value='UPDATE']")).click();
		WebElement ele10 = driver.findElement(By.xpath("//a[text()='Aegon Life']"));
		new WebdriverUtility().mousehoveraction(driver, ele10);
		ele10.click();
		WebElement ele11 = driver.findElement(By.name("key"));
		new WebdriverUtility().mousehoveraction(driver, ele11);
		ele11.sendKeys(name);
		
		
	}

}
