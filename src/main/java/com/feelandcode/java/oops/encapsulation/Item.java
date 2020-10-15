package com.feelandcode.java.oops.encapsulation;

/**
 * This class represents item. Carries item information Can be used an example
 * to encapsulation : bundles both data and related methods together
 */
public class Item {

	// hide the variable by declaring as private
	private String itemName;
	private int quantity;
	private double unitPrice;

	// default constructor
	public Item() {

	}

	public Item(String itemName, int quantity, double unitPrice) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		//validation logic added - to ensure the correctness of item entered by user 
		if (itemName != null && itemName.length() == 0)
			throw new IllegalArgumentException("Invalid Item");
		this.itemName = itemName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
