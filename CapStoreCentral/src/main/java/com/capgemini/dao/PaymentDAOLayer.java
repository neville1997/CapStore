package com.capgemini.dao;

import java.util.List;

import com.capgemini.dto.CustomerOrders;
import com.capgemini.dto.Invoice;
import com.capgemini.dto.OrderEntries;

public interface PaymentDAOLayer {
	
	// Place Order Operations
	public List<String> selectAddress(int customerId);
	public CustomerOrders retrieveAddress(int customerId, int addressId);
	public CustomerOrders addCoupon(int couponId, int customerId);
	public CustomerOrders removeCoupon(int couponId, int customerId);
	public OrderEntries retrieveOrderDetails(int orderId);
	public OrderEntries changeStatus(int orderId, String status);
	
	// Payment and Invoice Operations
	public Invoice generateInvoice(int orderId, int customerId);
	public Invoice makePayment(int amount, int orderId, int customerId);
	public Invoice retrieveInvoice(int invoiceId);
}
