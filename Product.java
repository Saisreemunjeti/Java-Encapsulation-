package com.product;

import com.manufacturer.Manufacturer;

public class Product {

	private String productName;
	private String category;
	private Manufacturer manufacturer;
	private double price;
	public Product(String productName, String category, Manufacturer manufacturer, double price) {
		this.productName = productName;
		this.category = category;
		this.setPrice(price);;
		this.setManufacturer(manufacturer);;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		if(manufacturer==null) {
			this.manufacturer=null;
		}
		else {
			this.manufacturer = manufacturer;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
			this.price=0;
		}
		
	}

	public String toString() {
		return "Product [productName=" + productName + ", category=" + category + ", manufacturer=" + manufacturer
				+ ", price=" + price + "]";
	}
	
	public static Product getProductObject(String productName, String category, Manufacturer manufacturer, double price) {
		return new Product(productName,category,manufacturer,price);
	}
	
}