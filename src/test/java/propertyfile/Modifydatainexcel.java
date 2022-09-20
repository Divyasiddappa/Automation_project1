package propertyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Modifydatainexcel {

	public static void main(String[] args) throws IOException
	{
		//step1: convert the physical file into java readable object
		FileInputStream fisexcel = new FileInputStream("./src/test/resources/data file.xlsx");
		//step2: open the excel workbook
		 Workbook wb=WorkbookFactory.create(fisexcel);
		 //step3:get the control on sheet
		 Sheet sheet = wb.getSheet("d1(1)");
		 //step4:get the control on the row
		Row row = sheet.createRow(18);
		//step5:create a cell
		Cell cell = row.createCell(3);
		//step6:update the status/set the data
		cell.setCellValue("skip");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data file.xlsx");
		//step7: write the data into excel
		wb.write(fos);
		System.out.println("data updated successfully");
		//step8: close the workbook
		wb.close();
		

	}

}
