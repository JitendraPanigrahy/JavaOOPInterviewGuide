package com.feelandcode.java.oops.interview.question.three;

/**
 * Question - Will the following code compile ? 
 * Answer - Yes, it will compile
 * Note - From Java 5 you can also use a covariant type as return type for overridden methods
 *        here Integer is return type - subclass of return type of super class I.e. Number 
 */  

public class Derived extends Base {
	public Integer show(){
        System.out.println("Show method in Derived Class");
        return 0;
    }
}
