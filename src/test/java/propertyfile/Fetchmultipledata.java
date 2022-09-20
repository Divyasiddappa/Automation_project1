package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchmultipledata {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data file.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("d1(1)");
		DataFormatter df=new DataFormatter();
		for(int i=0;i<=sheet.getLastRowNum();i++)	
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j))+"  ||");
			}
			System.out.println();
		}
	}

}
