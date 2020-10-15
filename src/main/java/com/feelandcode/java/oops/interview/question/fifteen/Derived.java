package com.feelandcode.java.oops.interview.question.fifteen;

import java.util.ArrayList;

public class Derived extends Base {  //Overload inherited method in inheritance
	public void show(ArrayList list) { // This is overloaded version of Base class show() method, not overridden
		System.out.println("Show method in Derived Class");
	}
}
