package com.feelandcode.java.oops.inheritance.specification;

import java.util.ArrayList;
import java.util.List;

/**
 * client or application class that interact with abstract class to use the report implementation
 * classes for report generation. 
 * This class demonstrates inheritance for specification
 */
public class RerportClient {

	public static void main(String[] args) {
		
		List<BaseReport> reports= new ArrayList();
		BaseReport wordReport = new WordReport();
		reports.add(wordReport);
		BaseReport excelReport = new ExcelReport();
		reports.add(excelReport);
		BaseReport pdfReport = new PdfReport();
		reports.add(pdfReport);
		
		//generate reports (wordreport/excelreport/pdfreport) based on the subclass objects 
		// referred to by superclass reference variable
		for(BaseReport report : reports)
		    generate(report);
		
	}
	//invoke generate method based on the implementation class (subclass) objects referred to by the super class
	public static void generate(BaseReport report) {
		report.generate();
	}
}
