package com.capgemini.dto;

import java.sql.Timestamp;

public class CustomerOrders {
	private int orderId;
	private int customerId;
	private int couponId;
	private int addressId;
	private Timestamp timestamp;
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
