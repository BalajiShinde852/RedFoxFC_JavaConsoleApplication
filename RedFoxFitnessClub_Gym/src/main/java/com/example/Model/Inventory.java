package com.example.Model;

public class Inventory {

	public Inventory(int quantityleft, String itemName, int price, int quantitySold) {
		super();
		this.quantityleft = quantityleft;
		this.itemName = itemName;
		this.price = price;
		this.quantitySold = quantitySold;
	}

	private int quantityleft;
	
	private String itemName;
	
	private int price;
	
	private int quantitySold;
	
	public Inventory() {
		
	}

	public int getQuantityleft() {   
		return quantityleft;
	}

	public void setQuantityleft(int quantityleft) {
		this.quantityleft = quantityleft;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	@Override
	public String toString() {
		return "Inventory [quantityleft=" + quantityleft + ", itemName=" + itemName + ", price=" + price
				+ ", quantitySold=" + quantitySold + "]";
	}
}
