package com.feelandcode.java.oops.classandobject;

/**
 * This class defines the mobile
 */

public class Mobile {

	// Member Variables
	private String brand;
	private String color;
	private int storage;

	// Default Constructor
	public Mobile() {

	}

	// Parameterized Constructor
	public Mobile(String brand, String color, int storage) {
		this.setBrand(brand);
		this.setColor(color);
		this.setStorage(storage);
	}

	// Member Methods - getters and setters - accessor methods to set and access the
	// attribute values

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the storage
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * @param storage the storage to set
	 */
	public void setStorage(int storage) {
		this.storage = storage;
	}

}
