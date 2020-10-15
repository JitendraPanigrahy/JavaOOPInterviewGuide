package com.feelandcode.java.oops.interview.question.seventeen;

public class DerivedException extends BaseException {
	
	public String customErrorMessage = "-DerivedCustomError";

	public DerivedException() {
		super();  //invoke super class constructor
	}

	public DerivedException(String message) {
		super(message);  //invoke super class constructor
	}

	public String getMessage() {  // access immediate super class method and variable
		return super.getMessage() + super.customErrorMessage + customErrorMessage;
	}
}
