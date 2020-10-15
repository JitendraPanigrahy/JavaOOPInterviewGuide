package com.feelandcode.java.oops.inheritance.construction;

/**
 * client or application class that generate report for different report types 
 * This class demonstrates inheritance for construction
 */
public class RerportClient {

	public static void main(String[] args) {
		
		//generate word report
		WordReport wordReport = new WordReport();
		wordReport.generateWord();
		
		//generate excel report
		ExcelReport excelReport = new ExcelReport();
		excelReport.generateExcel();
	}
}
