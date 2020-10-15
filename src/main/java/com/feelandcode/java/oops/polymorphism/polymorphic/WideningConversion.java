package com.feelandcode.java.oops.polymorphism.polymorphic;
/**
 * Application class that demonstrates implicit or widening conversion 
 * This implements coercion polymorphism
 * It shows how implicit conversion used in polymorphic way in java
 */
public class WideningConversion {

	public static void main(String[] args) {
		int  i=5;
        float f= i+10;  // integer value assigned to float
        double d=f*2.5;  // float value assigned to double
        System.out.println("widening conversion : "+d);
	}

}
