package com.feelandcode.java.oops.inheritance.construction;
/**
 * class represent the excelreport extends wordreport to inherit the getRerportContent method and  generate the excel report
 * Instances of excelreport may not behave like wordreport, though it extends wordreport to reuse the inherited method
 */
public class ExcelReport  extends WordReport {
	/**
	 * This method generates excel report
	 */
	//generate excel report
	public void generateExcel() {
		//inherits from super class
		String reportContent= getRerportContent("excel");
		System.out.println("Generating word report - " + reportContent);
	}
}
