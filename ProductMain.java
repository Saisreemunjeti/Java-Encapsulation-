package com.main2;

import com.product.Product;
import com.manufacturer.Manufacturer;

public class ProductMain {
	public static void main(String[] args) {
		
		Manufacturer manufacturer=Manufacturer.getManufacturerObject("Meghana", "Hyderabad", "548megha");
		Product product=Product.getProductObject(""
				+ "Thar", "vechile", manufacturer, 320.0);
		System.out.println(product);
		if( manufacturer==null) {
			System.out.println("invalid product/Manufacturer");
		}
	}
}

