package com.feelandcode.java.oops.interview.question.thirteen;

/**
 * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error
 * Error - Cannot override the final method from Base
 * Note - Final methods are inherited but cannot be overridden
 */
public class Derived extends Base {
	public void show() {
		System.out.println("Show method in Derived Class");
	}
}
