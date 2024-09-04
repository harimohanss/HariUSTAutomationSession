package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String name;
	private double price;
	
	 public Product(String name, double price) {
		this.name = name;
		this.price = price;
	
	 }
	 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}

class ShoppingCart{
	private List<Product> products;
	
	public ShoppingCart() {
		this.products = new ArrayList<>();
	}
	
	//Anoop we need to add addproduct, deleteproduct, etc
}
	


