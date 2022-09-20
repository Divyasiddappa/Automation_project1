package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdatabasedonkey {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data file.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("d1(1)");
		DataFormatter df=new DataFormatter();
		String[][] arr = new String[sheet.getLastRowNum()+1][sheet.getRow(4).getLastCellNum()];
		for( int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<=sheet.getRow(4).getLastCellNum();j++)
				{
					arr[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
				}
		}
		for (int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<=sheet.getRow(4).getLastCellNum();j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
