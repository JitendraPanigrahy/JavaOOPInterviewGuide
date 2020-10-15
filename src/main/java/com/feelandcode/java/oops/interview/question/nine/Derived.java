package com.feelandcode.java.oops.interview.question.nine;

/**
 * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error
 * Error - The return type is incompatible with Base.show()
 */
public class Derived extends Base {
	public int show() {
		System.out.println("Show method in Derived Class");
		return 0;
	}
}
