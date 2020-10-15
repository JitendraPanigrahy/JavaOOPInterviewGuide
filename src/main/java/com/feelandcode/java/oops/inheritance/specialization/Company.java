package com.feelandcode.java.oops.inheritance.specialization;

import java.util.List;

/**
 * This class carries company information. 
 * The developer can subclass this  class and
 * define their own method and inherit get and set methods from this class
 */

public class Company {
	private String name;
	private String type;
	private List<String> locations;
	private int noOfEmployees;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the locations
	 */
	public List<String> getLocations() {
		return locations;
	}

	/**
	 * @param locations the locations to set
	 */
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	/**
	 * @return the noOfEmployees
	 */
	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * @param noOfEmployees the noOfEmployees to set
	 */
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
    
}
