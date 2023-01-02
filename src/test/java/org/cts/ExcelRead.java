package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
public static void main(String[] args ) throws IOException {
	
	
	
	//mention the file location 
	File f = new File ("C:\\Users\\Ezhil\\eclipse\\java-2022-09\\eclipse\\configuration\\org.eclipse.oomph.setup\\1December\\src\\test\\resources\\TestData\\Untitled spreadsheet.xlsx");
	
	// Read the value from xl
	
	FileInputStream fin = new FileInputStream(f);
	
	
	Workbook w = new XSSFWorkbook(fin);
	
	//to get Sheet
	
	Sheet s = w.getSheet("ezhil");
	
	for(int i =0 ;i<s.getPhysicalNumberOfRows() ;i++) {
		
		Row r = s.getRow(i);
		
		for(int j =0 ; j<r.getPhysicalNumberOfCells(); j++) {
			
			Cell c = r.getCell(j);
			int cellType = c.getCellType();
			
			if(cellType==1) {
				
				String value = c.getStringCellValue();
				System.out.println(value);
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				
				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,YYYY");
				String value = sim.format(d);
				System.out.println(value);
				}
			else {
				double e = c.getNumericCellValue();
				long l = (long)e;
				String k = String.valueOf(l);
				System.out.println(k);
				
			}
				
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

    
	

















}
