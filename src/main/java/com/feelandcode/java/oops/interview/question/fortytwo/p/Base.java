package com.feelandcode.java.oops.interview.question.fortytwo.p;
/**
 * Question - How do you prevent a class from being extended/subclassed outside the package ? 
 * Answer - define constructor with no access modifier to prevent subclassing from outside package
 * Error - Implicit super constructor Base() is not visible for default constructor. Must define an explicit constructor
 */
public class Base {
	Base(){} //default constructor with default scope - no access modifier, not visible to outside package
}
