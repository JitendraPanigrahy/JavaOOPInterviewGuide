package com.feelandcode.java.oops.abstraction;
/**
 * client or application class that interact with abstract class to use the report implementation
 * classes for report generation. This class will not be affected for any internal changes occurred 
 * in the implementation classes behind the abstract classes
 */
public class Client {

	public static void main(String[] args) {
		
		//generate wordreport with help of abstraction: basereport
		BaseReport wordReport = new WordReport();
		generate(wordReport);
		
		//generate excelreport with help of abstraction: basereport
		BaseReport excelReport = new ExcelReport();
		generate(excelReport);
		
		//generate pdfReport with help of abstraction: basereport
		BaseReport pdfReport = new PdfReport();
		generate(pdfReport);
		
	}
	//invoke generate method based on the implementation class (subclass) objects referred to by the super class
	public static void generate(BaseReport report) {
		report.generate();
	}
}
