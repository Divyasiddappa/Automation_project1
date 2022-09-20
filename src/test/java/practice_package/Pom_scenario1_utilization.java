package practice_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.zurich.objectrepository.Client_additionpage;
import org.zurich.objectrepository.Common_page;
import org.zurich.objectrepository.Fetchtabledetails;
import org.zurich.objectrepository.Loginpage;
import generalUtility.ExcelUtility;
import generalUtility.Iconstants;
import generalUtility.Textfieldnames;
import generalUtility.WebdriverUtility;

public class Pom_scenario1_utilization {

	public static void main(String[] args) {
		// launch browser
		WebDriver driver;
		WebdriverUtility driver1 = new WebdriverUtility();
		driver = driver1.starttheapplication("chrome", 10, Iconstants.URL);
		String strurl = driver.getCurrentUrl();
		if ((Iconstants.URL).equals(strurl)) {
			System.out.println("the login page is being displayed");
		} else {
			System.out.println("the login page is  not being displayed");
		}
		// fetch data from excel
		ExcelUtility excel = new ExcelUtility();
		String Username = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","username");
		String password = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					Textfieldnames.Password);
		String client_password = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","Clientpassword");
		String client_name = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","Name");
		String client_image = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Image");
			String client_gender = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Gender");
			String client_dob = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Birth_date");
			String marital_status = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Maritalstatus");
			String client_nid = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Nid");
			String client_phone = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Phone");
			String client_address = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Address");
			String policy_id = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Policy_id");
			String nominee_name = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Nominee_name");
			String nominee_gender = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Nominee_gender");
			String nominee_dob = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Nominee_birth_date");
			String nominee_nid = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Nominee_nid");
			String relationship = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Relationship");
			String priority = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Priority");
			String nominee_phno = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"Nominee_Phone");
			String clientedited_name = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
					"editedname");
		// user part
		Loginpage login = new Loginpage(driver);
		login.user(Username, password);
		Common_page common = new Common_page(driver);
		common.clickonclient();
		common.clickaddclient();
		Client_additionpage page1 = new Client_additionpage(driver);
		String ele100= common.clientid();
		page1.clientdetails(client_password, client_name, client_image, client_gender, client_dob, marital_status,
				client_nid, client_phone, client_address, policy_id);
		// String ele101=common.agent_iddetails();
		// String elel02=common.nominee_iddetails();
		page1.nomineedetails(nominee_name, nominee_gender, nominee_dob, nominee_nid, relationship, priority,
				nominee_phno);
		page1.clickonsubmit();
		page1.clickonclientpage();
		Fetchtabledetails page2 = new Fetchtabledetails();
		page2.fetchdetails(driver, ele100, client_name, client_dob, client_nid, client_phone, client_address);
		WebElement ele10 = common.returnHome();
		driver1.mousehoveraction(driver, ele10);
		ele10.click();
		WebElement ele11 = common.returnsearch();
		driver1.mousehoveraction(driver, ele11);
		ele11.sendKeys(client_name);
		common.clickonsearchbtn();
		page2.fetchdetails(driver, ele100, client_name, client_dob, client_nid, client_phone, client_address);
		page2.clickonrequiredclient(driver,client_name);
		common.clickonedit();
		page1.clientname(clientedited_name);
		page1.updateclient();
		WebElement ele1 = common.returnHome();
		driver1.mousehoveraction(driver, ele1);
		ele1.click();
		WebElement ele2 = common.returnsearch();
		driver1.mousehoveraction(driver, ele2);
		ele2.sendKeys(clientedited_name);
		common.clickonsearchbtn();
		page2.fetchdetails(driver, ele100, clientedited_name, client_dob, client_nid, client_phone, client_address);
		driver.close();

	}

}
