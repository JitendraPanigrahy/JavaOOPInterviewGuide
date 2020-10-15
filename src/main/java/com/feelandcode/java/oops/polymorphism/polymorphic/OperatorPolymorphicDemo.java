package com.feelandcode.java.oops.polymorphism.polymorphic;
/**
 * Application class that demonstrates how '+' operator can be implemented in polymorphic way in java
 */
public class OperatorPolymorphicDemo {

	public static void main(String[] args) {
		int intSum = 5 + 10;  // '+' operator used to add two integers
		String stringConcat = "poly" + "morphism";  // '+' operator used to concat two strings
		double floatSum = 2.5f + 3.5f; // '+' operator used to concat two floats
		System.out.printf("Integer Sum: %d, String Concat: %s, Float Sum: %f", intSum, stringConcat, floatSum);
	}

}
