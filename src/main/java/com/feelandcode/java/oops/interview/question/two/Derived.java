package com.feelandcode.java.oops.interview.question.two;

/**
 * Question - Will the following code compile ?
 * Answer - Yes, it will compile. As, it is not the case of overridden.
 * Here, show() method from base class is not visible to derived class. 
 * Note - Private methods are not overridden
 */

public class Derived extends Base {
	//to compile, change the access modifier to public
	private void show(){
	      System.out.println("Show method in Derived Class");
    }

}
