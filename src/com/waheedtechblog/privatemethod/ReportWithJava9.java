/**
 * 
 */
package com.waheedtechblog.privatemethod;

/**
 * @author abdul
 *
 */
public interface ReportWithJava9 {

	default String getData(String dataType) {
		String data = getConnection();
		return covertData(data,dataType);
	}

	private String getConnection() {
		// create the connection to database
		// fetch the data
		return "return";
	}

	private String covertData(String data, String dataType) {
		if (dataType.equals("XML")) {
			return "XML DATA";
		} else if (dataType.equals("CSV")) {
			return "CSV DATA";
		} else if (dataType.equals("JSON")) {
			return "JSON DATA";
		}
		return "default data type";
	}

}
