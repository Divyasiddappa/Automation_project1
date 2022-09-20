package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis1=new FileInputStream("./src/test/resources/data file.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		try
		{
			 Sheet sheet = wb1.getSheet("d3");
			 int data = (int)sheet.getRow(0).getCell(0).getNumericCellValue();
			 System.out.println(data);
		}
		finally
		{
			wb1.close();
			
		}

	}

}
