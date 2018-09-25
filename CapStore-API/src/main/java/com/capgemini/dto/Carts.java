package com.capgemini.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "carts")
public class Carts {
	@Id
	@Column(name="cart_id")
	@NotEmpty(message="Field cannot be empty") 
	private int serialNumber;

	@Column(name="quantity")
	@Min(value=0, message="Quantity must be positive")
	private int quantity;
	
	@Column(name="product_id")
	@NotEmpty(message="Field cannot be empty") 
	private int productId;
	
	@Column(name="merchant_id")
	@NotEmpty(message="Field cannot be empty") 
	private int merchantId;
	
	@Column(name="customer_id")
	@NotEmpty(message="Field cannot be empty") 
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
