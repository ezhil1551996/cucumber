package org.utilities;


import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();			
	}
	public static void winmax() {
		driver.manage().window().maximize();	
	}
	
	public static void loadurl(String url) {
		
		driver.get(url);
		
	}
	public static void printTitle() {
		
		System.out.println(driver.getTitle());	
		}

	public static void PrintCurrentUrl(){
		
		System.out.println(driver.getCurrentUrl());
		
	}
	public static void fill(WebElement ele ,String value) {
		
		ele.sendKeys(value);	
	}
	public static void btnClick(WebElement ele ) {
		
	ele.click();	
	}
	public static void close() {
		
		driver.quit();
		
	}
	
	public static void rightClick(WebElement  ele) {
	 a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
    public static void dClick(WebElement ele) {
		
		a = new Actions(driver) ;
		a.doubleClick(ele);
		
	}
		public static void moveElement(WebElement ele) {
			a= new Actions(driver);
			a.moveToElement(ele);
		}
		
		public static void dragDrop(WebElement src, WebElement des) {
			a=new Actions(driver);
			a.dragAndDrop(src, des);
			
		}
		
		
		public static String GetData(int RowNumber,int cellNumber) throws IOException {
			
			File f= new File("C:\\Users\\Ezhil\\eclipse\\java-2022-09\\eclipse\\configuration\\org.eclipse.oomph.setup\\1December\\src\\test\\resources\\TestData\\Untitled spreadsheet.xlsx");
			
			FileInputStream fin = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(fin);
			
			Sheet s = w.getSheet("ezhil");
			
			Row R = s.getRow(RowNumber);
			
			Cell cell = R.getCell(cellNumber);
			
			int cellType = cell.getCellType();
			
			
			
			String value="";
			if (cellType==1) {
				
				 value = cell.getStringCellValue();
				
			}
		else if (DateUtil.isCellDateFormatted(cell)) {
			
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd MMMM YYYY");
			 value = sim.format(d);
				
			}
			
		else {
	         double d = cell.getNumericCellValue();
	         long l = (long)d;
	          value = String.valueOf(l);
	          
		}
			
			
			return value;
			
			
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

