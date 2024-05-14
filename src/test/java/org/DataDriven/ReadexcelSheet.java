package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadexcelSheet {
	
	@Test
	public void Excel() throws IOException  {
		File scr = new File("C:\\Users\\DELL\\eclipse-workspace\\TestNG Projects\\ExcelFile\\Data.xlsx");
		FileInputStream  f = new FileInputStream(scr);
		Workbook book = new XSSFWorkbook(f);
	
		      Sheet s = book.getSheet("Sheet1");
		   for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			   Row row = s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
				
			}
		   }
		      
		    
		    
		    
		      }
		         
		      
		      
		     
		      
	
	  
		
		
		
	}
	
	
	
	


