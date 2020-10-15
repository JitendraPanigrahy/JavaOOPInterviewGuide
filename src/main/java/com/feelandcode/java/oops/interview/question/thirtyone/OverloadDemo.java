package com.feelandcode.java.oops.interview.question.thirtyone;

/**
 * Question - Find output of this program
 * class demonstrates method overloading
 */
public class OverloadDemo {

	public void show(int i) {
		System.out.println("Show method – primitive argument");
	}

	public void show(Integer i) {
		System.out.println("Show method – object argument");
	}

	public static void main(String[] args) {
		OverloadDemo demo = new OverloadDemo();
		demo.show(5); // This will call show(int i)
		demo.show(Integer.valueOf(5)); // This will call show(Integer i)
	}

}
