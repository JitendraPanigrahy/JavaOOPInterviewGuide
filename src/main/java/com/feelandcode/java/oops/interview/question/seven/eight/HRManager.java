package com.feelandcode.java.oops.interview.question.seven.eight;

public class HRManager extends Manager {
	String basicQualification = "Degree, PMP, MBA"; // it shadows or hides the variable in class Manager

	public void show() { // it overrides the show() method in Manager class
		System.out.println("HRManager basicQualification : " + basicQualification);
	}
}
