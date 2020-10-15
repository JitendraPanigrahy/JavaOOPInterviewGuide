package com.feelandcode.java.oops.interview.question.twelve;

public class Derived extends Base {
	public void show(char c, int i) { // shadows or hides static or class method show() in Base
		System.out.println("Show method in Derived Class");
	}
}
