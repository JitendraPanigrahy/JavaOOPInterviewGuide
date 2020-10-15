package com.feelandcode.java.oops.interview.question.sixteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Question - Explain Upcasting and Downcasting with example
 * Demonstrates Upcasting and Downcasting
 * Note :  Here, benefits of using upcasting is , it prevents code to be tightly coupled with Patient class.
 * It helps to implement runtime polymorphism.
 * Since the reference is of a Patient class,
 * it can hold any of its child class IndoorPatient/OutdoorPatient object 
 */
public class OverridingDemo {

	public static void main(String[] args) {
		   //Upcasting - Casting from Subtype to Supertype
	       Patient iPatient = new IndoorPatient (); 
	       
	        //Invoke overridden method getPatientDetails()
	       //Implementing Runtime polymorphism
	       iPatient.getPatientDetails(); 
	       
	       //Invokes derived class specific method
	       getPatientBillingAmount(iPatient) ; 
	       
	       //Upcasting
	       Patient oPatient = new OutdoorPatient (); 
	       
	       //Invoke overridden method
	       oPatient.getPatientDetails() ;
	       
	       //Invokes derived class specific method
	       getPatientBillingAmount(oPatient) ; 
	}
	
	// This method shows the use of downcasting - Casting from Supertype to Subtype
	public static void getPatientBillingAmount(Patient patient) {

		// Add check to avoid ClassCastException during downcasting
		if (patient instanceof IndoorPatient) {
			
			// Downcasting
			IndoorPatient indoorPatient = (IndoorPatient) patient; 
			
			// Benefits of using downcasting. Invokes derived class specific method.
			indoorPatient.billingAmount();

		} else if (patient instanceof OutdoorPatient) {
			OutdoorPatient outdoorPatient = (OutdoorPatient) patient;
			
			// Benefits of using downcasting
			outdoorPatient.billingAmount();
		} 
	} 
}
