package com.feelandcode.java.oops.interview.question.ten.y;

import com.feelandcode.java.oops.interview.question.ten.x.Base;

/**
 * Question - Will the following code compile ? 
 * Answer - Yes, it will compile.
 * Note - This is not the case of overriding. Here, subclass that is in a different
 * 		  package than the parent class, so method show() with default scope is not
 *        visible to class Derived.
 */
public class Derived extends Base {
	int show() { // default access modifier
		System.out.println("Show method in Derived Class");
		return 0;
	}
}
