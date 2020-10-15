package com.feelandcode.java.oops.interview.question.twentynine;

public class Base {
	static { // static block
		System.out.println("Base class : Static Block");
	}

	{ // instance block
		System.out.println("Base class : instance Block");
	}

	// default constructor
	public Base() {
		System.out.println("Base class : default constructor");
	}

}
