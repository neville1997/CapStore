package com.capgemini.dto;

public class Carts {
	private int serialNumber;
	private int quantity;
	private int productId;
	private int merchantId;
	private int customerId;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Carts(int serialNumber, int quantity, int productId, int merchantId, int customerId) {
		super();
		this.serialNumber = serialNumber;
		this.quantity = quantity;
		this.productId = productId;
		this.merchantId = merchantId;
		this.customerId = customerId;
	}
	public Carts() {
		super();
	}
}
