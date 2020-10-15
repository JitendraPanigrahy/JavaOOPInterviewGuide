package com.feelandcode.java.oops.interview.question.four;

/**
 * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error
 * Error - This instance method cannot override the static method
 * Note -  Static methods are not overridden
 */

public class Derived extends Base {
	public void show() {
		System.out.println("Show method in Derived Class");
	}
}
