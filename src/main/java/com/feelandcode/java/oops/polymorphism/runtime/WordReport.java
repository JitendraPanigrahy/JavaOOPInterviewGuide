package com.feelandcode.java.oops.polymorphism.runtime;
/**
 * class extends the abstract class basereport and override the generate method to generate the word report
 */
public class WordReport extends BaseReport{

	/**
	 * This method generates word report
	 */
	@Override
	public void generate() {
		System.out.println("Generating word report..");
	}

}
