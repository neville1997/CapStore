package com.capgemini.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "wishlist")
public class WishList {
	
	@Id
	@Column(name="wishlist_id")
	@NotEmpty(message="Field cannot be empty") 
	private int wishlistId;
	
	@Column(name="product_id")
	@NotEmpty(message="Field cannot be empty") 
	private int productId;
	
	@Column(name="merchant_id")
	@NotEmpty(message="Field cannot be empty") 
	private int merchantId;
	
	@Column(name="customer_id")
	@NotEmpty(message="Field cannot be empty") 
	private int customerId;

	public int getwishlistId() {
		return wishlistId;
	}
	public void setwishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
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
	public WishList(int wishlistId, int productId, int merchantId, int customerId) {
		super();
		this.wishlistId = wishlistId;
		this.productId = productId;
		this.merchantId = merchantId;
		this.customerId = customerId;
	}
	public WishList() {
		super();
	}
}
