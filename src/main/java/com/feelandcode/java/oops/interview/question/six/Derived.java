package com.feelandcode.java.oops.interview.question.six;

public class Derived extends Base {
	public static void show() { // shadows or hides static or class method show() in Base
		System.out.println("Show method in Derived Class");
	}
}
