package com.feelandcode.java.oops.inheritance.specialization;

/**
 * This class represent a patient The developer can subclass this class and
 * define their own method and inherit get and set methods from this class
 * Subclasses can override the inherited method to provide the specialized
 * behavior
 */
public class Patient {

	private String registrationNo;
	private String name;
	private String address;

	/**
	 * @return the registrationNo
	 */
	public String getRegistrationNo() {
		return registrationNo;
	}

	/**
	 * @param registrationNo the registrationNo to set
	 */
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPatientDetails() {
		StringBuilder patientDetail = new StringBuilder();
		patientDetail.append("Registration No : "+ registrationNo).append(" Name : "+name).append(" Address : "+ address);
		return patientDetail.toString();
	}

}
