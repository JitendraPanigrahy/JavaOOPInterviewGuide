package com.feelandcode.java.oops.encapsulation;

import java.util.ArrayList;
import java.util.List;
/**
 * Application class that generate bill based on the items purchased
 */
public class BillingApp {

	public static void main(String[] args) {
		// Create Item
		List <Item> items = new ArrayList();
		Item item = new Item();

		// populate the items purchased
		item.setItemName("Patato");
		item.setQuantity(10);
		item.setUnitPrice(36.00);
		
		items.add(item);
		
		item= new Item("Onion",12,30.00);
		//add items into list
		items.add(item);
		
		// create Bill
		Bill bill = new Bill(items);

		// Generate bill. Call print method to see total price
		bill.print();
	}
}
