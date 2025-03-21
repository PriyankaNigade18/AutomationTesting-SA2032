package com.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelFileReadingTest {
  @Test
  public void fileRead() throws IOException
  {
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row--->cell--->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	 XSSFSheet sheet1= wb.getSheet("userdata");
	 
	 //number of rows from the file
	 int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	 System.out.println("Total Rows are: "+rows);//5
	 
	 //number of columns from the file
	 int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	 System.out.println("Number of cells are: "+cells);//2
	 
	 //declare Storage as Array of same size like file- to store file data
	 Object data[][]=new Object[rows-1][cells];//reading only 4 rows
	 
	  
	 //iterate array and read data from file and store it into array
	 
	 for(int r=1;r<rows;r++)//rows skip the heading starts iteration from 1st row
	 {
		 
		 for(int c=0;c<cells;c++)
		 {
			 //read the data from file and store it into array
			 //array always store data at 0th position r-1
			 data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
			 System.out.print(data[r-1][c]+"    ");
		 }
		 System.out.println();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /*
	  * How to read single entry
	 String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
	 
	 System.out.println(value);
	 
	 
	 XSSFRow row3=sheet1.getRow(2);
	 
	 XSSFCell cell1=row3.getCell(0);
	 
	 String data=cell1.getStringCellValue();
	 
	  System.out.println(data);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
