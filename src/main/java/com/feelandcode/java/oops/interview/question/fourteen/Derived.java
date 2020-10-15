package com.feelandcode.java.oops.interview.question.fourteen;

/**
 * Question - Will the following code compile ? 
 * Answer - Yes, it will compile
 * Note - Subclass overridden method can be declared as final
 */
public class Derived extends Base {
	public final void show() {
		System.out.println("Show method in Derived Class");
	}
}
