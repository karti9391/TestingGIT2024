package com.Automation.objectrepositary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fip = new  FileInputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\src\\com\\Automation\\objectrepositary\\or.properties");
	Properties prop = new Properties();
	prop.load(fip);
	
	/*
	 * String unid_value=prop.getProperty("un_id"); System.out.println(unid_value);
	 * 
	 * String unxpath_value = prop.getProperty("un_xpath");
	 * System.out.println(unxpath_value);
	 */
	
	prop.setProperty("un_id", "karthikk@gmail.com");
	prop.setProperty("hardwork", "job");
	
	//prop.store(new FileOutputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\src\\com\\Automation\\objectrepositary\\or.properties"), "file is saved successfully");
	FileOutputStream fop = new FileOutputStream("C:\\Users\\k.karthik\\OneDrive\\Desktop\\kksoft123\\TestingDEC2023\\src\\com\\Automation\\objectrepositary\\or.properties");
	prop.store(fop, "file is saved sucessfully");
}
}
