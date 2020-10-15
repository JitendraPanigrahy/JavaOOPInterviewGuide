package com.feelandcode.java.oops.interview.question.forty;

/**
 * Question - Will the following program compile ?
 * Answer :    Yes, it will compile
 * It shows how superclass static method called using subclass name
 */
public class OverridingDemo {

	public static void main(String[] args) {
		Derived.show();   //Call superclass static method using subclass name
        Derived.display();  
	}

}
