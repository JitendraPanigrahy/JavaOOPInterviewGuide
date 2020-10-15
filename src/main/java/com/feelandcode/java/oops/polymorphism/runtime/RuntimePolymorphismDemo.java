package com.feelandcode.java.oops.polymorphism.runtime;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates Runtime polymorphism implementation
 * using upcasting, method overriding and dynamic method lookup.
 */
public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		
		List<BaseReport> reports= new ArrayList();
		
		BaseReport wordReport = new WordReport();  //Upcasting - casting from subtype to supertype
		reports.add(wordReport);
		
		BaseReport excelReport = new ExcelReport();
		reports.add(excelReport);
		
		BaseReport pdfReport = new PdfReport();
		reports.add(pdfReport);
		
		//generate reports (wordreport/excelreport/pdfreport) based on the subclass objects 
		// referred to by superclass reference variable
		reports.forEach(report-> report.generate());
		
	}
}
