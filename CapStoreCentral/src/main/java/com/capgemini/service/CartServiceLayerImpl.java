package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.capgemini.dao.CartDAOLayer;
import com.capgemini.dto.Carts;
import com.capgemini.dto.WishList;

public class CartServiceLayerImpl implements CartServiceLayer {
	
	@Autowired
	private CartDAOLayer cartdao;
	
	@Override
	public Carts addToCart(int productId, int customerId, int quantity, int merchantId) {
		return cartdao.addToCart(productId, customerId, quantity, merchantId);
	}

	@Override
	public Carts removeFromCart(int cartId) {
		return cartdao.removeFromCart(cartId);
	}

	@Override
	public Carts emptyCart(int customerId) {
		return cartdao.emptyCart(customerId);
	}

	@Override
	public Carts saveCart(int customerId) {
		return cartdao.saveCart(customerId);
	}

	@Override
	public Carts retrieveCart(int customerId) {
		return cartdao.retrieveCart(customerId);
	}

	@Override
	public WishList addToWishList(int productId, int customerId, int merchantId) {
		return cartdao.addToWishList(productId, customerId, merchantId);
	}

	@Override
	public WishList removeFromWishList(int wishlistId) {
		return cartdao.removeFromWishList(wishlistId);
	}

	@Override
	public WishList emptyWishList(int customerId) {
		return cartdao.emptyWishList(customerId);
	}

	@Override
	public WishList saveWishList(int customerId) {
		return cartdao.saveWishList(customerId);
	}

	@Override
	public WishList retrieveWishList(int customerId) {
		return cartdao.retrieveWishList(customerId);
	}
}
