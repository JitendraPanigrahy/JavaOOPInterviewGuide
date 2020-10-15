package com.feelandcode.java.oops.interview.question.sixteen;

/**
 * This class represents IndoorPatient It extends the patient class and inherits
 * the getPatientDetails method from. It has IS-A relationship to the Patient
 * class. It provides its own method billingAmount()
 */
public class IndoorPatient extends Patient {

	// overrides patient class method, can add special behavior
	public void getPatientDetails() {
		System.out.println("Class: IndoorPatient – Method : getPatientDetails() ");
	}

	// Method specific to IndoorPatient class
	public void billingAmount() {
		System.out.println("Class: IndoorPatient – Method : billingAmount() ");
	}

}
