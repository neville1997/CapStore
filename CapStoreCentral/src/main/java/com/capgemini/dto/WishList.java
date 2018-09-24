package com.capgemini.dto;

public class WishList {
	private int wishlistId;
	private int productId;
	private int merchantId;
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
