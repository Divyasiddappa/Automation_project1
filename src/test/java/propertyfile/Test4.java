package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data file.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		try
		
		{
		Sheet sheet = wb.getSheet("d1");
		String username = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(username);
		}
		finally
		{
			wb.close();
		}
	}

}
