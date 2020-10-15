package com.feelandcode.java.oops.interview.question.three;
/**
 * demo class - creates base class and derived class objects and call the overriden methods
 */
public class OverridingDemo {

	public static void main(String[] args) {
		Base base = new Base(); // create new base class object
		base.show(); // base class method show()
		Derived derived = new Derived(); // create new derived class object
		derived.show(); // derived class method show()
	}

}
