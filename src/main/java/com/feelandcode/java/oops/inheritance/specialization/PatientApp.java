package com.feelandcode.java.oops.inheritance.specialization;
/**
 * Application class that demonstrates Inheritance for specialization
 * Instances of subclasses behave like subclass and they have Is-A relationship to the superclass
 */
public class PatientApp {

	public static void main(String[] args) {

		IndoorPatient indoorPatient = new IndoorPatient();
		indoorPatient.setRegistrationNo("A008");
		indoorPatient.setName("abc");
		indoorPatient.setAddress("xyz");
		indoorPatient.setAdmissionNo("123");
		indoorPatient.setBedNo(1002);
		System.out.println(indoorPatient.getPatientDetails());
		
		//check if instance of IndoorPatient has Is-A relationship to the Patient class
		if(indoorPatient instanceof Patient)
			System.out.println("IndoorPatient Is-A Patient");
	}

}
