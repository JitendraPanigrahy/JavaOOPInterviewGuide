package com.feelandcode.java.oops.inheritance.construction;
/**
 * class represent the wordreport  generate the word report
 */
public class WordReport{

	/**
	 * This method generates word report
	 */
	public void generateWord() {
		String reportContent= getRerportContent("word");
		System.out.println("Generating word report - " + reportContent);
	}
	
	public String getRerportContent(String reportType) {
		return "ReportContent";
	}

}
