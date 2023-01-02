package org.cts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	
	public static void main(String[] args) throws IOException  {
		
		
		
		File f = new File("C:\\Users\\Ezhil\\eclipse\\java-2022-09\\eclipse\\configuration\\org.eclipse.oomph.setup\\1December\\src\\test\\resources\\TestData\\ezhil.xlsx");
		
		
		boolean newFile = f.createNewFile();
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("mx1");
		
		Row Row = s.createRow(0);
		
		Cell c = Row.createCell(1);
		
		c.setCellValue("Selenium");
		
		Cell d = Row.createCell(2);
		d.setCellValue("bbbh");
		
         FileOutputStream fin = new FileOutputStream(f);
         
         w.write(fin);
         
         System.out.println("suc");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
