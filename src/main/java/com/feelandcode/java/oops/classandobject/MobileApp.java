package com.feelandcode.java.oops.classandobject;
/**
 * Application class that access the mobile attributes
 */
public class MobileApp {
	public static void main(String[] args) {

		// Create Mobile Objects //represent real mobile
		Mobile one = new Mobile();
		Mobile two = new Mobile();
		Mobile three = new Mobile("BrandZ","Silver",30); //call parameterized constructor

		// populate mobile object  // call setter methods 
		one.setBrand("BrandX"); 
		one.setColor("Black");
		one.setStorage(26);

		two.setBrand("BrandY");  
		two.setColor("White");
		two.setStorage(30);
		

		// Test it – call getter and setter methods to access the attribute values
		System.out.println("Brand : " + one.getBrand() + " - Color : " + one.getColor() + " - Storage : " + one.getStorage() + " GB");
		System.out.println("Brand : " + two.getBrand() + " - Color : " + two.getColor() + " - Storage : " + two.getStorage() + " GB");
		System.out.println("Brand : " + three.getBrand() + " - Color : " + three.getColor() + " - Storage : " + three.getStorage() + " GB");
	}
}
