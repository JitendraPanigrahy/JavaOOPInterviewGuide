package com.feelandcode.java.oops.interview.question.thirtynine;

/**
 * Question - Find of sum of value of ‘ i ’ initialized in all three classes in multilevel inheritance
 * Answer - 60
 */
public class OverridingDemo {

	public static void main(String[] args) {
		SubDerived subDerived = new SubDerived();  
        int sumOfI= subDerived.i + ((Derived )subDerived).i + ((Base )subDerived).i;
        System.out.println(sumOfI);
	}

}
