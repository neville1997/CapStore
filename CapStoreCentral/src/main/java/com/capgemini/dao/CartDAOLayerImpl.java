package com.capgemini.dao;

import com.capgemini.dto.Carts;
import com.capgemini.dto.WishList;

public class CartDAOLayerImpl implements CartDAOLayer {

	@Override
	public Carts addToCart(int productId, int customerId, int quantity, int merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carts removeFromCart(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carts emptyCart(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carts saveCart(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carts retrieveCart(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishList addToWishList(int productId, int customerId, int merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishList removeFromWishList(int wishlistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishList emptyWishList(int wishlistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishList saveWishList(int wishlistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishList retrieveWishList(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
