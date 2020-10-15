package com.feelandcode.java.oops.interview.question.twentysix;

/**
 * Question - Find output of this program
 * Demonstrates method overloading in inheritance
 */
public class OverridingDemo {

	public static void main(String[] args) {
		Base base = new Derived();  //upcasting
		Derived derived= (Derived)base;  // downcasting
		base.show(5);  // call super class show method.
		derived.show(5); // call derived class show method
		derived.show(new Integer(5)); // call super class show method
	}

}
