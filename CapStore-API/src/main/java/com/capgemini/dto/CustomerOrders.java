package com.capgemini.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer_orders")
public class CustomerOrders {
	
	@Id
	@Column(name="order_id")
	@NotEmpty(message="Field cannot be empty")
	private int orderId;
	
	@Column(name="customer_id")
	@NotEmpty(message="Field cannot be empty") 
	private int customerId;
	
	@Column(name="coupon_id")
	@NotEmpty(message="Field cannot be empty") 
	private int couponId;
	
	@Column(name="address_id")
	@NotEmpty(message="Field cannot be empty") 
	private int addressId;
	
	@Column(name="timestamp")
	private Timestamp timestamp;
	
	@Column(name="order_total")
	@Min(value=0, message="Total amount must be positive")
	private double orderTotal;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public CustomerOrders(int orderId, int customerId, int couponId, int addressId, Timestamp timestamp,
			double orderTotal) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.couponId = couponId;
		this.addressId = addressId;
		this.timestamp = timestamp;
		this.orderTotal = orderTotal;
	}
	public CustomerOrders() {
		super();
	}
}
