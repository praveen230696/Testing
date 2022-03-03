package org.kiot.shopmanagement;

import org.kiot.product.Product;
import org.kiot.shop.Shop;
public class ShopManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(101, 10000, "Redmi Note 7s", "MobilePhone");
		Shop shop1 = new Shop(1,"abc", product);
	
		if (shop1.createProduct(product) == true) {
			System.out.println("products added successfully");
		}
		
		else {
			System.out.println("products added failed");
		}
		
		if (shop1.searchProduct(product.getId()) == true) {
			System.out.println("based on id products displayed successfully");
			
		}
		
		else {
			System.out.println("id not found");
		}
		
		Product newProduct = new Product();
		newProduct.setId(product.getId());
		newProduct.setPrice(20000);
		
		//System.out.println("checking" + newProduct);
		if (shop1.updateProduct(newProduct) == true) {
			
			System.out.println("based on id products updated successfully");
		}
		
		else {
			System.out.println("id not found");
		}
		
		if (shop1.deleteProduct(product.getId()) == true) {
			System.out.println("based on id products deleted successfully");
		}
		
		else {
			System.out.println("id not found");
		}
	}

}
