package com.waheedtechblog.trywithresources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * This class will explain the try with resources which was introduced with
 * JDK7.
 * 
 * @author AbdulWaheed18@gmail.com
 *
 */
public class ExmapleWithJava7 {

	public static void main(String[] args) throws FileNotFoundException {

		try (FileOutputStream fileStream = new FileOutputStream("App.log");) {
			String logMessage = "[INFO] DATA NEED TO BE WRITTEN";
			byte logMessageInBytes[] = logMessage.getBytes();
			fileStream.write(logMessageInBytes);
			System.out.println("Updated log files.");
		} catch (Exception e) {
			// handle error
		}
	}
}
