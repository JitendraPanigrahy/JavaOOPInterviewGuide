package com.feelandcode.java.oops.inheritance.specialization;

import java.util.List;
/**
 * This class represents software company. 
 * It extends the company class and inherits the get and set methods from.
 * It has IS-A relationship to the Company class.
 * Instances of this class act like Company
 * It defines its own method(s) to provide special behavior
 */
public class SoftwareCompany extends Company{

	 private List<String> solutions;

	/**
	 * @param solutions the solutions to set
	 */
	public void setSolutions(List<String> solutions) {
		this.solutions = solutions;
	}

	/**
	 * This method provides special behavior
	 * @return the solutions - software solutions
	 */
	public List<String> getSolutions() {
		return solutions;
	}
	
}
