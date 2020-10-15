package com.feelandcode.java.oops.interview.question.thirtytwo;

/**
 * Question - Will the following code compile ?
 * Answer - No, it will not compile
 * Error - Duplicate method show() in type OverloadDemo
 * Note - Overloaded methods must have different parameters. Return type does not matter here.
 */
public class OverloadDemo {

	public void show() {
     	 System.out.println("Show method");
     }

    public int show() {
     	 return 0;
     }

}
