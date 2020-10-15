package com.feelandcode.java.oops.interview.question.seventeen;
/**
 * Question - Give an example using ‘super’ keyword
 * This class demonstrates use of ‘super’ keyword
 * Note :   - ‘super’ keyword refers to immediate super class. 
 * 			- It is used to access immediate super class variable. 
 * 			- It is used to call immediate super class method from the subclass that overrides. 
 * 			- It is used to call immediate super class constructor from within subclass constructor .
 */
public class SuperKeywordDemo {
	
	public static void main(String[] args) {
		try {
			testCustomException();
		} catch (DerivedException exception) {
			System.out.println(exception);
		}
	}

	public static void testCustomException() throws DerivedException {
		throw new DerivedException("SuperKeywordDemoException");
	}

}
