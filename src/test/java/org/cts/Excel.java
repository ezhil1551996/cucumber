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

public class Excel {


public static void main(String[] args, int getPhysicalNumberOfRows) throws IOException {
	
	
	
	
	//Mention the file path
	File F = new File("C:\\Users\\Ezhil\\eclipse\\java-2022-09\\eclipse\\configuration\\org.eclipse.oomph.setup\\1December\\src\\test\\resources\\TestData\\Untitled spreadsheet.xlsx");
	//Read value from xl
	FileInputStream fin = new FileInputStream(F);
	
	Workbook w = new XSSFWorkbook(fin);
	
	//To get Sheet 
	
	Sheet s = w.getSheet("ezhil");
	for(int i = 0; i<getPhysicalNumberOfRows;i++) {
		
	Row R = s.getRow(i);
	
	for(int j=0;j<R.getPhysicalNumberOfCells();j++) {

	Cell C = R.getCell(j);
	
	int cellType = C.getCellType();
	
	if (cellType==1) {
		 
		String value = C.getStringCellValue();
		System.err.println(value);
	}
	else if (DateUtil.isCellDateFormatted(C)) {
		
		Date D = C.getDateCellValue();
		
		SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
		
	String value = sim.format(D);
	

		System.out.println(value);
		
	}
	else {
		double d = C.getNumericCellValue();
		long l =(long)d;
		
		String value = String.valueOf(l);
		System.out.println(value);
		
	}
	
		
		
	}
		
	}
	
}
}