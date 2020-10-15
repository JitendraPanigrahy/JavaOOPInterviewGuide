package com.feelandcode.java.oops.interview.question.fortythreee;
 /**
 * Class demonstrates runtime polymorphism in multilevel inheritance
 */
public class OverridingDemo {
	public static void main(String[] args) {
		// Create employee object
        Employee employee  = new Employee();
          //call employee class show() method
         employee.show();
          // Employee class reference variable refers to Manager class object
         Employee manager  = new Manager(); //upcasting
          //call manager class show() method
         manager.show(); //implementing runtime polymorphism 
          // Employee class reference variable refers to HRManager class object
         Employee hrManager  = new HRManager();
          //call hrmanager class show() method
         hrManager.show();  //Uses dynamic method lookup/dispatch
	}
}
