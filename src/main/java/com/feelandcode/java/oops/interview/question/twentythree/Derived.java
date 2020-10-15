package com.feelandcode.java.oops.interview.question.twentythree;

/**
 * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error 
 * Error - Exception Exception is not compatible with throws clause in Base.show()
 */

public class Derived extends Base {
	public void show() throws Exception {
		System.out.println("Show method in Derived Class");
	}

}
