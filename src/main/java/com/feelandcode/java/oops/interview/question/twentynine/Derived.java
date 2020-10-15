package com.feelandcode.java.oops.interview.question.twentynine;

public class Derived extends Base { // Overload inherited method in inheritance
	static {
		System.out.println("Derived class : Static Block");
	} // static block

	{
		System.out.println("Derived class : instance Block");
	} // instance block

	// default constructor
	public Derived() {
		System.out.println("Derived class : default constructor");
	}

}
