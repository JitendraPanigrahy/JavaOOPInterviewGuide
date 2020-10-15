package com.feelandcode.java.oops.polymorphism.compiletime;

import java.util.Arrays;
/**
 * Application class that demonstrates method overloading
 * It implements compile time or static polymorphism
 */
public class MethodOverloadingDemo {

	public static void main(String[] args) {

		int[] intValues = new int[] { 1, 2 };
		char[] chars = new char[] { 'a', 'b', 'c', 'd' };
		boolean[] booleans = new boolean[] { true, false };
		Object[] objects = new Object[] { Integer.valueOf("5"), "6" };

		//Overloaded versions of toString method from class Arrays
		System.out.println(Arrays.toString(intValues));
		System.out.println(Arrays.toString(chars));
		System.out.println(Arrays.toString(booleans));
		System.out.println(Arrays.toString(objects));

	}

}
