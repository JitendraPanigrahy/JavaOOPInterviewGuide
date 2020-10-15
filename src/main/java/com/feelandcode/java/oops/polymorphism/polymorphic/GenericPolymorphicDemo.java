package com.feelandcode.java.oops.polymorphism.polymorphic;

/**
 * Application class that demonstrates how Generic can be implemented in
 * polymorphic way in java This implements parametric polymorphism
 */
public class GenericPolymorphicDemo {

	// This is generic method uses parameter type E
	private static <E> void print(E type) {
		System.out.println(type);
	}

	// shows generic method and parameter type used in polymorphic way
	public static void main(String[] args) {
		print("Parametric Conversion via Generic Method");
		print(Integer.valueOf(10));
		print(Double.valueOf(2.5));
	}
}
