package com.feelandcode.java.oops.inheritance.specialization;

import java.util.List;
/**
 * This class represents textile company 
 * It extends the company class and inherits the get and set methods from.
 * It has IS-A relationship to the Company class.
 * Instances of this class act like Company
 * It defines its own method(s) to provide special behavior
 */
public class TextileCompany extends Company{

	 List<String> brands;

	/**
	 * @param brands the brands to set
	 */
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

	/**
	 * This method provides special behavior
	 * @return the brands
	 */
	public List<String> getBrands() {
		return brands;
	}

}
