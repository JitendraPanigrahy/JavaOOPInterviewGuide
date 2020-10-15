package com.feelandcode.java.oops.abstraction;
/**
 * class extends the abstract class and override the generate method to generate the pdf report
 */
public class PdfReport extends BaseReport{

	/**
	 * This method generates pdf report
	 */
	@Override
	public void generate() {
		System.out.println("Generating pdf report..");
	}

}
