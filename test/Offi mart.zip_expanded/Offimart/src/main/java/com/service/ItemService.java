package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.exception.InvalidItemException;
import com.model.Item;

//use appropriate annotation to configure ElectricityService as a Service
@Service
public class ItemService {
	private ArrayList<Item> itemList = new ArrayList<Item>();

	// calculate the totalCost and return the cost
	public double calculateCost(double costPerKg, int quantity) {
		// fill the code
		return (costPerKg * quantity);
	}

	// Fetch the product by using productName
	public Item getItemFromList(String itemName) {

		// fill the code
		Item item = null;
		for (Item obj : itemList) {
			if (obj.getItemName().equalsIgnoreCase(itemName)) {
				item = obj;
			}
		}
		return item;
	}

	// update Item quantity in the productList
	public boolean performUpdate(Item item, int quantity) throws InvalidItemException {
		// fill the code
		boolean flag = false;
		if (item.getQuantity() >= quantity) {
			item.setQuantity(item.getQuantity() - quantity);
			flag = true;
		} else {
			throw new InvalidItemException("No stocks are available for the item " + item.getItemName());
		}
		return flag;
	}

//.....Don't delete this code........

	public ItemService() {
		addItems();
	}

	public void addItems() {

		itemList.add(new Item("AP101", "IDcard holder", 200, 75));
		itemList.add(new Item("AP102", "Whiteboard", 75, 250));
		itemList.add(new Item("AP103", "Pen", 150, 10));
		itemList.add(new Item("AP104", "Binder clips", 100, 2));
		itemList.add(new Item("AP105", "Cutter", 50, 25));
		itemList.add(new Item("AP106", "Stamp pad", 45, 50));
		itemList.add(new Item("AP107", "Notepad", 100, 15));
		itemList.add(new Item("AP108", "Marker", 100, 20));
		itemList.add(new Item("AP109", "Notebook", 100, 20));
		itemList.add(new Item("AP109", "Marker", 100, 20));
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> list) {
		this.itemList = list;
	}

}
