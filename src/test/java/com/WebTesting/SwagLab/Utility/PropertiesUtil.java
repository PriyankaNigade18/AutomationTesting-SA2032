package com.WebTesting.SwagLab.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil
{

	public Properties p1;
	
	public PropertiesUtil(String fileName)
	{
		
		//to read file-create instance of Properties class java
		  
		  p1=new Properties();
		//create instance of File class -give path of the file
		  File f1=new File(System.getProperty("user.dir")+"//ConfigData//"+fileName+".properties");
		  
		  //To read data in Stream-FileInputStream class
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //load the file
			  p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	
	public String getData(String key)
	{
		return p1.getProperty(key);
		
	}
}
