package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchdatabasedonkey2 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data file.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("d1(1)");
		DataFormatter df=new DataFormatter();
		String value =null;
		//int i = 0;
		// use while loop to get fetch the data from the row part that is the to get the key values
		//while(i<=sheet.getLastRowNum())
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			 String key=df.formatCellValue(sheet.getRow(i).getCell(0));
			 if(key.equalsIgnoreCase("username"))
			 {
				 value = df.formatCellValue(sheet.getRow(i).getCell(1));
				 break;
				 
			 }
			//i1++;
		}
		System.out.println(value);
	}

}
