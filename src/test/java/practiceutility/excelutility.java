package practiceutility;

import generalUtility.ExcelUtility;
import generalUtility.Iconstants;

public class excelutility 

{
public static void main(String[] args)
{
  String excel = new ExcelUtility().inputFile(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", 0, 1);
  System.out.println(excel);
 

}


}

	

