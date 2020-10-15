package com.feelandcode.java.oops.polymorphism.runtime;

/**
 * The implementation classes will subclass this abstract class and
 * define/override the generate() method to generate the type of report
 */
public abstract class BaseReport {
	 /**
     * Abstract method declaration to generate report.
     * Subclass must override this method to generate type of report
     */
	public abstract void generate();
}
