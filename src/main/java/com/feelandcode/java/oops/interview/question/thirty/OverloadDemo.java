package com.feelandcode.java.oops.interview.question.thirty;

/**
 * Question - Will the following code compile ?
 * Answer - Yes, it will compile
 * Demonstrates how different versions of show() methods overloaded = - with
 * different number, type, order of parameters and different access modifiers
 * and return types
 */
public class OverloadDemo {

	public void show(int i) {
		System.out.println("Show method - int parameter");
	}

	protected int show() {
		System.out.println("Show method - without parameter");
		return 0;
	}

	void show(String s, Integer i) {
		System.out.println("Show method – string, integer parameters");
	}

	private void show(Integer i, String s) {
		System.out.println("Show method – integer, string parameters");
	}
	
	public static void main(String[] args) {
    	OverloadDemo demo= new OverloadDemo();
    	demo.show();
    	demo.show(25);  
    	demo.show("str",5 );  
    	demo.show(5,"str");
	}
}
