package com.feelandcode.java.oops.interview.question.thirtysix;

/**
 * class with  constructors overloaded
 * Here, once constructor called from another constructor using ‘this’ keyword that refers to current object. 
 */
public class Company {
	String name;
	String industry;
	String type;

	public Company() { // Default constructor
		this("abc", "public", "software");
	}

	public Company(String name, String type, String industry) {
		this(name, type); // parameterized constructor
		this.industry = industry;
	}

	public Company(String name, String type) { // parameterized constructor
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", industry=" + industry + ", type=" + type + "]";
	}
	
	
}
