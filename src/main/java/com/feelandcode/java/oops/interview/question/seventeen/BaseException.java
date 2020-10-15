package com.feelandcode.java.oops.interview.question.seventeen;

public class BaseException extends Exception {
	
	public String customErrorMessage = "-BaseCustomError";

	public BaseException() {
		super();    //invoke super class constructor
	}

	public BaseException(String message) {
		super(message);   //invoke super class constructor
	} 

	public String getMessage() {
		return super.getMessage();   // invoke immediate super class method 
	}

}
