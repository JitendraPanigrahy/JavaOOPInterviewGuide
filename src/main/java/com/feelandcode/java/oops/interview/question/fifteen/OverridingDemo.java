package com.feelandcode.java.oops.interview.question.fifteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Question - Find output of this program
 * Demonstrates method overloading in inheritance
 */
public class OverridingDemo {

	public static void main(String[] args) {
		List list = new ArrayList(); // List reference variable refers to ArrayList object
		Base base = new Derived(); // Superclass reference variable refers subclass object
		// call super class show method only, as show() method is not overridden here
		base.show(list);
		// call super class show method only, as show() method is not overridden here
		base.show(new ArrayList());
		Derived derived = (Derived) base; // Downcasting - casting from supertype to subtype
		derived.show(list); // call super class show method inherited by subclass. overloaded in subclass
		derived.show(new ArrayList()); // call derived class overridden show method }
	}

}
