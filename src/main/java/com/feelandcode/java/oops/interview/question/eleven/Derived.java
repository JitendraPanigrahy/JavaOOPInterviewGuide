package com.feelandcode.java.oops.interview.question.eleven;

/**
 * Question - Will the following code compile ? 
 * Answer - Yes, it will compile.
 * Note  - It is not the case of overriding. 
 * In this class, it is overloading of inherited method show() 
 */
public class Derived extends Base {
	public void show(int i) {
		System.out.println("Show method in Derived Class");
	}
}
