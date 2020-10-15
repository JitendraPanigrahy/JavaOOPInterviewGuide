package com.feelandcode.java.oops.interview.question.twentyeight;

/**
 * * Question - Will the following code compile ? 
 * Answer - No, it will not compile and show error 
 * Error - The method show(int) of type Derived must override or implement a supertype method.
 * Note : If in case, superclass method signature changed or method name renamed or method removed,
 *        then compiler will indicate about it by showing above error when @Override annotation used 
 *        with overridden method.
 */
public class Derived extends Base {
	@Override
	public void show(int i){
		System.out.println("Show method in Derived Class");
    }

}
