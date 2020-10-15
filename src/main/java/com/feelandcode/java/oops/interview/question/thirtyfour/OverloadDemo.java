package com.feelandcode.java.oops.interview.question.thirtyfour;

import java.util.ArrayList;
import java.util.List;

/**
 * Question - Find output of this program
 * class demonstrates method overloading
 */
public class OverloadDemo {

	public void show(ArrayList list) {
     	 System.out.println("Show method – ArrayList parameter");
     }
	
    public void show(List list) {
     	 System.out.println("Show method  – List parameter ");
     }

	public static void main(String[] args) {
		List list = new ArrayList();
    	ArrayList arrayList = new ArrayList();
    	OverloadDemo demo= new OverloadDemo();
    	demo.show(list);  // This will call show(List list)
    	demo.show(arrayList );  // This will call show(ArrayList arrayList )

	}

}
