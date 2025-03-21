package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingPropertiesFile {
  @Test
  public void fileReading() throws IOException 
  {
	  //create instance of File class -give path of the file
	  //System.getProperty("user.dir"): read path upto current project
	  
	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  //To read data in Stream-FileInputStream class
	  FileInputStream fs=new FileInputStream(f1);
	  
	  
	  //to read file-create instance of Properties class java
	  
	  Properties p1=new Properties();
	  
	  //load the file
	  p1.load(fs);
	  
	  //read the file
	 System.out.println("BrowserName is: "+ p1.getProperty("browserName"));
	  System.out.println("User name is: "+p1.getProperty("un"));
	  System.out.println("User password is: "+p1.getProperty("psw"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
