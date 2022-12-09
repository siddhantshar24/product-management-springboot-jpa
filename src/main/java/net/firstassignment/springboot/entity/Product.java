package net.firstassignment.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	private long productId;
	
	@Column(name="price")
	private long price;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="name")
	private String name;
	
	public Product()
	{
		
	}
	
	public Product(long productId, long price, long quantity, String name) {
		super();
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
