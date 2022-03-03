package org.kiot.shop;

import java.util.ArrayList;
import java.util.List;
import org.kiot.product.Product;

public class Shop {
	private int shopNumber;
	private String shopName;
	Product product;
	private List <Product>productList = new ArrayList<Product>();
	
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Shop(int shopNumber, String shopName, Product product) {
		super();
		this.shopNumber = shopNumber;
		this.shopName = shopName;
		this.product = product;
	}

	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		if (product != null) {		
			productList.add(product);
			return true;
		}
		return false;
		
	}
	
	public boolean searchProduct(int id) {		
		for(Product product : productList) {
			if(product.getId() == id) {
				//System.out.println(product);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateProduct(Product product) {
		int counter = 0;
		for(Product innerproduct : productList) {
			if(innerproduct.getId() == product.getId()) {
				if(product.getPrice() != 0) {
					productList.get(counter).setPrice(product.getPrice());
				}
				if(product.getName() != null) {
					productList.get(counter).setName(product.getName());
				}
				if(product.getType() != null) {
					productList.get(counter).setType(product.getType());
				}
				return true;
			}
			counter++;
		}
		
		return false;
	}
	
	public boolean deleteProduct(int id) {
		int counter = 0;
		for(Product product1 : productList) {
			if(product1.getId() == id) {
				productList.remove(counter);
				return true;
			}
			counter++;
		}
		return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (shopNumber != other.shopNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shop [shopNumber=" + shopNumber + ", shopName=" + shopName + ", product=" + product + "]";
	
	}
	
	
	
}
