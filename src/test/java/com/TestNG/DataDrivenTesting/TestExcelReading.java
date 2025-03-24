package com.TestNG.DataDrivenTesting;

import org.testng.annotations.Test;

import com.generic.ExcelUtil;

public class TestExcelReading {
  @Test
  public void testFile()
  {
	 String data= ExcelUtil.getData("BookInfo",1,2);
	 System.out.println(data);
  }
}
