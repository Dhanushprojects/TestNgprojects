package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class DatadrivenDate{
	
	@Test
	public void dateUsing() throws IOException {
		File scr = new File("C:\\Users\\DELL\\eclipse-workspace\\TestNG Projects\\ExcelFile\\Data.xlsx");
		FileInputStream  f = new FileInputStream(scr);
		Workbook book = new XSSFWorkbook(f);
		Sheet shee = book.getSheet("Sheet1");
		for(int i=0;i<shee.getPhysicalNumberOfRows();i++) {
			Row row = shee.getRow(i);
			
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			Cell cell = row.getCell(j);
			
            int cellType = cell.getCellType();  
            if(cellType==1) {
         
            	String value = cell.getStringCellValue();
            	System.out.println(value);
           }
            else if(DateUtil.isCellDateFormatted(cell)) {
            	Date date = cell.getDateCellValue();
            	SimpleDateFormat sim = new SimpleDateFormat("MM/DD/YYYY");
            	    String value = sim.format(date);
            	    System.out.println(value);
            	
            	
            }else {
            	
            	double cellValue = cell.getNumericCellValue();
            	long l = (long)cellValue;
            	String value = String.valueOf(l);
            	
            	System.out.println(value);
            }
			
		}
			
		}
		
		
		
	}

	
	
}
