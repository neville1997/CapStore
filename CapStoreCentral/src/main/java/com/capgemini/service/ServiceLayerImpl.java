package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.DAOLayerAdmin;
import com.capgemini.dao.DAOLayerCustomer;
import com.capgemini.dao.DAOLayerMerchant;
import com.capgemini.dto.Admin;
import com.capgemini.dto.Customers;

@Service
public class ServiceLayerImpl implements ServiceLayer
{
	@Autowired
	private DAOLayerAdmin daorefAdmin;
	@Autowired
	private DAOLayerCustomer daorefCustomer;
	@Autowired
	private DAOLayerMerchant daorefMerchant;

	@Override
	public Admin validateAdmin(Admin admin)
	{
		return daorefAdmin.validateAdmin(admin);
	}

	
	@Override
	public Admin findById(int id) {
		return daorefAdmin.findById(id);
	}


	@Override
	public Customers createAccount(Customers cusDTO) {
		return daorefCustomer.createAccount(cusDTO);
	}


	@Override
	public Customers validateCustomerForLogin(Customers customer) {
		return daorefCustomer.validateCustomerForLogin(customer);
	}


	@Override
	public String check() {
		return daorefCustomer.check();
	}
}