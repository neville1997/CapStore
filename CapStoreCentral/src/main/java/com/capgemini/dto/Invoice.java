package com.capgemini.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "invoice")
public class Invoice {
	
	@Id
    @Column(name="transaction_id")
	@NotEmpty(message="Field cannot be empty") 
	private int invoiceId;
	
    @Column(name="order_id")
	@NotEmpty(message="Field cannot be empty") 
	private int orderId;
	
    @Column(name="status")
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
