package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/data file.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		try
		{
			Sheet sheet = wb.getSheet("d1");
			String data = sheet.getRow(1).getCell(1).toString();
			System.out.println(data);
			
		}
finally
{
	wb.close();
}
	}

}
