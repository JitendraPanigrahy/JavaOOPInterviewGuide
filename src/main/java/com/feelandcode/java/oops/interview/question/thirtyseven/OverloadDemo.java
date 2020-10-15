package com.feelandcode.java.oops.interview.question.thirtyseven;

import java.util.ArrayList;
import java.util.List;

/**
 * Question - Will the following code compile ?
 * Answer - No, it will not compile and show error.
 * Error: Erasure of method show(ArrayList<String>) is the same as another method in type OverloadDemo
 *        Erasure of method show(ArrayList<Integer>) is the same as another method in type OverloadDemo
 */
public class OverloadDemo {

	public void show(ArrayList<String> list) {
     	 System.out.println("Show method");
     }
    public void show(ArrayList<Integer> list) throws Exception {
     	 System.out.println("Show method");
    }

}
