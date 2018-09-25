package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.service.CartServiceLayer;
import com.capgemini.service.PaymentServiceLayer;

public class RestControllerCart {
	@Autowired
	private CartServiceLayer cartSer;
	@Autowired
	private PaymentServiceLayer paySer;
}
