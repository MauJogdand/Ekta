package excelSheetReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetReading2 {

	public static void main(String[] args) throws IOException {
        

		FileInputStream myfile= new FileInputStream("F:\\Software\\ScreenShots\\ExcelSheets\\FirstExcel.xlsx");

		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(value);

	}

}
