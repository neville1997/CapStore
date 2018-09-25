package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dao.PaymentDAOLayer;
import com.capgemini.dto.CustomerOrders;
import com.capgemini.dto.Invoice;
import com.capgemini.dto.OrderEntries;

public class PaymentServiceLayerImpl implements PaymentServiceLayer{

	@Autowired
	private PaymentDAOLayer paydao;

	@Override
	public List<String> selectAddress(int customerId) {
		return paydao.selectAddress(customerId);
	}

	@Override
	public CustomerOrders retrieveAddress(int customerId, int addressId) {
		return paydao.retrieveAddress(customerId, addressId);
	}

	@Override
	public CustomerOrders addCoupon(int couponId, int customerId) {
		return paydao.addCoupon(couponId, customerId);
	}

	@Override
	public CustomerOrders removeCoupon(int couponId, int customerId) {
		return paydao.removeCoupon(couponId, customerId);
	}

	@Override
	public OrderEntries retrieveOrderDetails(int orderId) {
		return paydao.retrieveOrderDetails(orderId);
	}

	@Override
	public OrderEntries changeStatus(int orderId, String status) {
		return paydao.changeStatus(orderId, status);
	}

	@Override
	public Invoice generateInvoice(int orderId, int customerId) {
		return paydao.generateInvoice(orderId, customerId);
	}

	@Override
	public Invoice makePayment(int amount, int orderId, int customerId) {
		return paydao.makePayment(amount, orderId, customerId);
	}

	@Override
	public Invoice retrieveInvoice(int invoiceId) {
		return paydao.retrieveInvoice(invoiceId);
	}
	
	

}
