package com.SpecialScenarios;

import java.util.List;

import org.testng.annotations.Test;

import com.Utilities.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PerformanceAnalysisForApp {
  @Test
  public void performanecParameterTesting() 
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initAppiumDriver();
	  
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  System.out.println("App Package name is: "+packageName);
	  
	 List<String> allDataTypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  
	 System.out.println(allDataTypes);
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	 
	 //batteryInfo
	 List<List<Object>> batteryData=((AndroidDriver)driver).getPerformanceData(packageName,"batteryinfo",5);
	 System.out.println(batteryData);
	 
	//MemoryInfo
		 List<List<Object>> memoryData=((AndroidDriver)driver).getPerformanceData(packageName,"memoryinfo",5);
		 System.out.println(memoryData);
	 
		//NetworkInfo
		 List<List<Object>> networkData=((AndroidDriver)driver).getPerformanceData(packageName,"networkinfo",5);
		 System.out.println(networkData);
	 
	  /*
		//CPUInfo
		 List<List<Object>> cpuData=((AndroidDriver)driver).getPerformanceData(packageName,"cpuinfo",5);
		 System.out.println(cpuData);
	  
	  */
	  
	  
  }
}
