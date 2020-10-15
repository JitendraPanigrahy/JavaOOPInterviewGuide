package com.feelandcode.java.oops.interview.question.thirtysix;

/**
 * Question - Give an example of constructor overloading 
 * Demonstrates how constructors are overloaded. 
 */
public class CompanyDemo {
	public static void main(String[] args) {
		Company abcCompany = new Company();  // invoke default constrcutor
		System.out.println(abcCompany);
		Company xyzCompany = new Company("XYZ", "private", "Textile");  // invoke parameterized constructor
		System.out.println(xyzCompany);
	}
}
