package com.capgemini.dao;

import com.capgemini.dto.Carts;
import com.capgemini.dto.WishList;

public interface CartDAOLayer {
	// Cart Operations
	public Carts addToCart(int productId, int customerId, int quantity, int merchantId);
	public Carts removeFromCart(int cartId);
	public Carts emptyCart(int customerId);
	public Carts saveCart(int customerId);
	public Carts retrieveCart(int customerId);
	
	// WishList Operations
	public WishList addToWishList(int productId, int customerId, int merchantId);
	public WishList removeFromWishList(int wishlistId);
	public WishList emptyWishList(int customerId);
	public WishList saveWishList(int customerId);
	public WishList retrieveWishList(int customerId);
}
