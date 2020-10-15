package com.feelandcode.java.oops.interview.question.seven.eight;

public class Manager extends Employee {
	String basicQualification = "Degree, PMP"; // it shadows or hides the variable in class Employee

	public void show() {
		System.out.println("Manager basicQualification : " + basicQualification);
	}
}
