package com.example.Service;

import java.util.Arrays;
import java.util.List;

import com.example.Model.Inventory;

public class InventoryService {

	static Inventory item1 = new Inventory(10, "Protein Bars", 10, 1);
	static Inventory item2 = new Inventory(100, "Protein Powders", 100, 1);
	static Inventory item3 = new Inventory(500, "Water Bottle", 10, 1);
	static Inventory item4 = new Inventory(10, "Shakers", 20, 1);
	static Inventory item5 = new Inventory(10, "Gloves", 20, 1);

	static List<Inventory> items = Arrays.asList(item1, item2, item3, item4, item5);
	
	public void displayShop() {
		System.out.println("The following items are available in shop");
		items.forEach(i -> System.out.println(i));
	}
}
