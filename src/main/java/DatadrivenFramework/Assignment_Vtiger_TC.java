package DatadrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment_Vtiger_TC{

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\A4-Selenium\\Book3.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Leads");
		
		sh.createRow(0).createCell(0).setCellValue("Tc_ID");
		
		
		
		FileOutputStream fos = new FileOutputStream("C:\\A4-Selenium\\Book3.xlsx");
		book.write(fos);
	}

}
