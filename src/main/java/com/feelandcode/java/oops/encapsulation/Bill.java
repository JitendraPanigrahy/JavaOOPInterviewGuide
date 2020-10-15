package com.feelandcode.java.oops.encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class responsible for generating bill for the items purchased
 */
public class Bill {

	// private double discount; -- can add in future, if in case required

	private double tax;
	
	List <Item> items = new ArrayList();
	
	Bill(List <Item> items) {
		this.items= items;
	}

	// this method is internal to this class
	// assume tax will come web service or database
	private double getTax() {
		tax = 5.0; 
		return tax == 0.0 ? 5.0 : tax;
	}
	// In future, if required, central and state GST, can replace variable Tax
	// private double cGST;
	// private double sGST;

	/**
	 * This method applies tax and calculate total price for the items purchased
	 * internal method
	 */
	private double findTotal() {
		double totalAmt = 0.0;
		// may apply discount if required in case
		for (Item item : items) {
			totalAmt += item.getQuantity() * item.getUnitPrice();
		}
		double taxedAmt = (totalAmt * getTax())/ 100;
		double totalAmtToPay = totalAmt + taxedAmt;
		return totalAmtToPay;
	}

	/**
	 * This method prints totalprice
	 */
	public void print() {
		System.out.println("Total Price : "+findTotal());
	}
}
