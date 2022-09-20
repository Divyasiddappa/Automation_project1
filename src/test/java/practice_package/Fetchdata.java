package practice_package;



import generalUtility.ExcelUtility;
import generalUtility.Iconstants;


public class Fetchdata {

	public static void main(String[] args) 
	{
		ExcelUtility excelutility = new ExcelUtility();
		/*List<Map<String,String>> data= excel.getdatafromexcel("Lifeinsurancemanagement-1");
		String Username = data.get(0).get(Textfieldnames.Username);
		String password = data.get(0).get(Textfieldnames.Password);
		String client_password = data.get(0).get(Textfieldnames.Clientpassword);
		String client_name = data.get(0).get(Textfieldnames.Name);
		String client_image = data.get(0).get(Textfieldnames.Image);
		String client_gender = data.get(0).get(Textfieldnames.Gender);
		String client_dob = data.get(0).get(Textfieldnames.Birth_date);
		String marital_status =data.get(0).get(Textfieldnames.Maritalstatus);
		String client_nid = data.get(0).get(Textfieldnames.Nid);
		String client_phone =data.get(0).get(Textfieldnames.Phone);
		String client_address = data.get(0).get(Textfieldnames.Address);
		String policy_id = data.get(0).get(Textfieldnames.Policy_id);
		String nominee_name = data.get(0).get(Textfieldnames.Nominee_name);
		String nominee_gender = data.get(0).get(Textfieldnames.Nominee_gender);
		String nominee_dob = data.get(0).get(Textfieldnames.Nominee_birth_date);
		String nominee_nid =data.get(0).get(Textfieldnames.Nominee_nid);
		String relationship = data.get(0).get(Textfieldnames.Relationship);
		String priority = data.get(0).get(Textfieldnames.Priority);
		String nominee_phno = data.get(0).get(Textfieldnames.Nominee_Phone);*/
//		String Username = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","username");
//	String password = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				Textfieldnames.Password);
//	String client_password = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","Clientpassword");
//	String client_name = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","Name");
//
//	String client_image = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//			"Image");
//		String client_gender = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Gender");
//		String client_dob = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Birth_date");
//		String marital_status = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Maritalstatus");
//		String client_nid = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Nid");
//		String client_phone = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Phone");
//		String client_address = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Address");
//		String policy_id = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Policy_id");
//		String nominee_name = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Nominee_name");
//		String nominee_gender = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//			"Nominee_gender");
//		String nominee_dob = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Nominee_birth_date");
//		String nominee_nid = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Nominee_nid");
//		String relationship = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Relationship");
//		String priority = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Priority");
//		String nominee_phno = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
//				"Nominee_Phone");
//		 String browser = excel.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "browser");
		 String url = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "url");
		 String browser = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "browser");
		 String Username = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Username");
		 String password = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "password");	
		 String client_password = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Clientpassword");
		String  client_name = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Name" );
		 String client_image = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Image" );
		String  client_gender = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Gender" );
		String client_dob = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Birth_date" );
		String marital_status = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Maritalstatus" );
		  String client_nid = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nid");
		String client_phone = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Phone");
		String client_address = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Address");
		String policy_id = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Policy_id");
		String nominee_id = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nominee_id" );
		String nominee_name = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nominee_name");
		String nominee_gender = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nominee_gender" );
		 String nominee_dob = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nominee_birth_date");
		String nominee_nid = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nominee_nid");
		String relationship = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Relationship");
		String priority = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Priority" );
		String nominee_phno= excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1","Nominee_Phone" );
		String client_edited_name= excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","editedname");
		String client_id=excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","Client_id");
	String	 month = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","month");
	String	 amount = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","amount");
	String	 due = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","due");
	String	 fine=excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1","fine");
		
		System.out.println(browser);
		System.out.println(password);
	System.out.println(client_password);
	System.out.println(client_name);
		System.out.println(client_image);
		System.out.println(client_gender);
		System.out.println(client_dob );
		System.out.println(marital_status);
		System.out.println(client_nid);
		System.out.println(client_phone);
		System.out.println(client_address);
		System.out.println(policy_id);
		System.out.println(nominee_name);
		System.out.println(nominee_gender);
	System.out.println(nominee_dob);
		System.out.println(nominee_nid);
		System.out.println(relationship);
		System.out.println(priority);
		System.out.println(nominee_phno);
		System.out.println(month);
		System.out.println(amount);
		System.out.println( due );
		System.out.println(fine);
		
		
	
	

		
		
		
		
		
		
	}

}
