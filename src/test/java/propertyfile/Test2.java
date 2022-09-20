package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {

	public static void main(String[] args) throws IOException 
	{
		//step1:convert physical file into java readable object
		FileInputStream fisExcel= new FileInputStream("./src/test/resources/data file.xlsx");
		//step2:open the excel workbook
		Workbook wb= WorkbookFactory.create(fisExcel);
		//step3:get the control on the sheet
		Sheet sheet = wb.getSheet("d1");
		//step4:get the control on row
		Row row = sheet.getRow(2);
		//step5:get the control on the cell
		Cell cell = row.getCell(1);
		//step6:fetch the data
		String browser=cell.getStringCellValue();
		System.out.println(browser);
		//step7:close the workbook
		wb.close();
		

	}

}
