package com.feelandcode.java.oops.interview.question.sixteen;

/**
 * This class represents OutdoorPatient It extends the patient class and
 * inherits the getPatientDetails method from. It has IS-A relationship to the
 * Patient class. It provides its own method billingAmount()
 */
public class OutdoorPatient extends Patient {

	// overrides patient class method, can add special behavior
	public void getPatientDetails() {
		System.out.println("Class: OutdoorPatient – Method : getPatientDetails() ");
	}

	// Method specific to OutdoorPatient class
	public void billingAmount() {
		System.out.println("Class: OutdoorPatient – Method : billingAmount() ");
	}

}
