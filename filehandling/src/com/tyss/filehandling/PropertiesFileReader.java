package com.tyss.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	
	public static void main(String[] args) {
		
		String path = "text.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String name = properties.getProperty("url");
			String company = properties.getProperty("user");
			String gf  = properties.getProperty("password");
//			
//			System.out.println("Name: "+url);
//			System.out.println("Company: "+user);
//			System.out.println("GF: "+gf);	
					
					
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
