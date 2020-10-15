package com.feelandcode.java.oops.interview.question.twentyseven;

/**
 * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error 
 * Error - The type Derived cannot subclass the final class Base
 * Note : Final class cannot be subclassed. Ex. class String, class System.
 *        Declaring a class as final prevents it from unwanted extensions. 
 *        So that behavior of the class should not be misused by subclass.
 */
public class Derived extends Base {
	public void show(){
		System.out.println("Show method in Derived Class");
    }

}
