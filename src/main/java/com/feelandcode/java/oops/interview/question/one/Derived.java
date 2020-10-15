package com.feelandcode.java.oops.interview.question.one;

/**
 * Question - Will the following code compile ?
 * Answer - No, it will not compile and show error.
 * Error - Cannot reduce the visibility of the inherited method
 */

public class Derived extends Base {
	//to compile, change the access modifier to public
	protected void show(){
	      System.out.println("Show method in Derived Class");
    }

}
