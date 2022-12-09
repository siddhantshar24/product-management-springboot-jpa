package net.firstassignment.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	
	
	@Column(name="order_name")
	private String orderName;
	
	@Column(name="product_id")
	private long productId;
	
	@Column(name="amount")
	private long amount;
	
	@Column(name="user_id")
	private long userId;
	
	public Order()
	{
		
	}
	
	public Order(String orderName, long productId, long amount, long userId) {
		super();
		this.orderName = orderName;
		this.productId = productId;
		this.amount = amount;
		this.userId = userId;
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	
	
	
	
	
	
	
	

}
