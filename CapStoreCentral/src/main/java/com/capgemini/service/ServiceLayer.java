package com.capgemini.service;

import com.capgemini.dto.Admin;
import com.capgemini.dto.Customers;

public interface ServiceLayer
{
	public Admin validateAdmin(Admin admin);
	public Admin findById(int id);
	public Customers createAccount(Customers cusDTO);
	public Customers validateCustomerForLogin(Customers customer);
	public String check();
}