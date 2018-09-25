package com.capgemini.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.capgemini.dto.Coupons;
import com.capgemini.dto.CustomerOrders;
import com.capgemini.dto.Invoice;
import com.capgemini.dto.OrderEntries;

public class PaymentDAOLayerImpl implements PaymentDAOLayer{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<String> selectAddress(int customerId) {
		// retrieve from group 1's method
		return null;
	}

	@Override
	public CustomerOrders retrieveAddress(int customerId, int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrders addCoupon(int couponId, int customerId) {
		try {
			Query query1 = entityManager.createQuery("select coupons from Coupons coupons where coupon_id = ?");
			query1.setParameter(1, couponId);
			Coupons relCoupon = (Coupons) query1.getSingleResult();
			int couponAmount = relCoupon.getCouponAmount();
			Query query2 = entityManager.createQuery("select customerorders from CustomerOrders customerorders where customer_id = ?");
			query2.setParameter(1, customerId);
			CustomerOrders custOrd = (CustomerOrders) query2.getSingleResult();
			Query query3 = entityManager.createQuery("select orderentries from OrderEntries orderentries where order_id = ?");
			query3.setParameter(1, custOrd.getOrderId());
			OrderEntries order = (OrderEntries) query3.getSingleResult();
			order.setDiscount(couponAmount);
			Double oldTot = custOrd.getOrderTotal();
			Double newTot = oldTot - couponAmount;
			custOrd.setOrderTotal(newTot);
			return custOrd;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public CustomerOrders removeCoupon(int couponId, int customerId) {
		try {
			Query query1 = entityManager.createQuery("select coupons from Coupons coupons where coupon_id = ?");
			query1.setParameter(1, couponId);
			Coupons relCoupon = (Coupons) query1.getSingleResult();
			int couponAmount = relCoupon.getCouponAmount();
			Query query2 = entityManager.createQuery("select customerorders from CustomerOrders customerorders where customer_id = ?");
			query2.setParameter(1, customerId);
			CustomerOrders custOrd = (CustomerOrders) query2.getSingleResult();
			Query query3 = entityManager.createQuery("select orderentries from OrderEntries orderentries where order_id = ?");
			query3.setParameter(1, custOrd.getOrderId());
			OrderEntries order = (OrderEntries) query3.getSingleResult();
			order.setDiscount(0);
			Double oldTot = custOrd.getOrderTotal();
			Double newTot = oldTot + couponAmount;
			custOrd.setOrderTotal(newTot);
			return custOrd;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public OrderEntries retrieveOrderDetails(int orderId) {
		try {
			Query query1 = entityManager.createQuery("select orderentries from OrderEntries orderentries where order_id = ?");
			query1.setParameter(1, orderId);
			return (OrderEntries) query1.getSingleResult();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public OrderEntries changeStatus(int orderId, String status) {
		Query query1 = entityManager.createQuery("select orderentries from OrderEntries orderentries where order_id = ?");
		query1.setParameter(1, orderId);
		OrderEntries curOrder = (OrderEntries) query1.getSingleResult();
		curOrder.setStatus(status);
		return curOrder;
	}

	@Override
	public Invoice generateInvoice(int orderId, int customerId) {
		Invoice curInvoice = new Invoice();
		curInvoice.setOrderId(orderId);
		curInvoice.setStatus("unpaid");
		return curInvoice;
	}

	@Override
	public Invoice makePayment(int amount, int orderId, int customerId) {
		// To paypal api logic must be put here
		Invoice curInvoice = new Invoice();
		curInvoice.setOrderId(orderId);
		curInvoice.setStatus("paid");
		return curInvoice;
	}

	@Override
	public Invoice retrieveInvoice(int invoiceId) {
		Query query1 = entityManager.createQuery("select invoice from Invoice invoice where transaction_id = ?");
		query1.setParameter(1, invoiceId);
		return (Invoice) query1.getSingleResult();
	}
	
}
