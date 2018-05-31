/**
 * 
 */
package com.waheedtechblog.privatemethod;

/**
 * @author abdul
 *
 */
public interface ReportWithJava8 {
	
	default String getXMLData() {
		//connect to the database
		//fetch the data
		//convert the data to XML format
		return "XML data";
	}
	
	default String getJSONData() {
		//connect to the database
		//fetch the data
		//convert the data to JSON
		return "JSON data";
	}
	
	default String getCSVData() {
		//connect to the database
		//fetch the data
		//convert the data to CSV format
		return "CSV data";
	}


}
