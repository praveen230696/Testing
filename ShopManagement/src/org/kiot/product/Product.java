package org.kiot.product;

public class Product {
	private int id;
	private int price;
	private String name;
	private String type;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, int price, String name, String type) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", type=" + type + "]";
	}	
}
