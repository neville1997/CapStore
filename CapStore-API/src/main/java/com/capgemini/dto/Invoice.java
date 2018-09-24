package com.capgemini.dto;

public class Invoice {
	
	private int invoiceId;
	private int orderId;
	private String status;
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Invoice(int invoiceId, int orderId, String status) {
		super();
		this.invoiceId = invoiceId;
		this.orderId = orderId;
		this.status = status;
	}
	public Invoice() {
		super();
	}
}
