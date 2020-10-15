package com.feelandcode.java.oops.inheritance.specification;
/**
 * class extends the abstract class basereport and override the generate method to generate the excel report
 */
public class ExcelReport extends BaseReport{

	/**
	 * This method generates excel report
	 */
	@Override
	public void generate() {
		System.out.println("Generating excel report..");
	}

}
