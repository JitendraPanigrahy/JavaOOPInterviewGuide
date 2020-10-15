package com.feelandcode.java.oops.interview.question.five;

/**
 * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error
 * Error - This static method cannot hide the instance method from Base
 */
public class Derived extends Base {
	public static void show() {
		System.out.println("Show method in Derived Class");
	}
}
