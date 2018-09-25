package com.capgemini.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "order_entries")
public class OrderEntries {
	
	@Id
    @Column(name="entry_id")
	@NotEmpty(message="Field cannot be empty") 
	private int entryId;
	
	@Column(name="order_id")
	@NotEmpty(message="Field cannot be empty") 
	private int orderId;
	
	@Column(name="product_id")
	@NotEmpty(message="Field cannot be empty") 
	private int productId;
	
	@Column(name="merchant_id")
	@NotEmpty(message="Field cannot be empty") 
	private int merchantId;
	
	@Column(name="quantity")
	@Min(value=0, message="Quantity must be positive")
	private int quantity;
	
	@Column(name="base_price")
	@Min(value=0, message="Prices must be positive")
	private double basePrice;
	
	@Column(name="discount")
	@Min(value=0, message="Discounts must be positive")
	private int discount;
	
	@Column(name="status")
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
