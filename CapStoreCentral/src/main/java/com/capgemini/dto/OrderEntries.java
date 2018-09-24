package com.capgemini.dto;

public class OrderEntries {
	private int entryId;
	private int orderId;
	private int productId;
	private int merchantId;
	private int quantity;
	private double basePrice;
	private int discount;
	private String status;
	
	public int getEntryId() {
		return entryId;
	}
	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OrderEntries(int entryId, int orderId, int productId, int merchantId, int quantity, double basePrice,
			int discount, String status) {
		super();
		this.entryId = entryId;
		this.orderId = orderId;
		this.productId = productId;
		this.merchantId = merchantId;
		this.quantity = quantity;
		this.basePrice = basePrice;
		this.discount = discount;
		this.status = status;
	}
	public OrderEntries() {
		super();
	}
}
