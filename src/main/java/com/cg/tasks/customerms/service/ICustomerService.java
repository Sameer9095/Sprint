package com.cg.tasks.customerms.service;

import com.cg.tasks.customerms.entities.*;

public interface ICustomerService {

	Customer findById(Long customerId);

	Customer createCustomer(String name);

	Customer addAmount(Long customerId, double amount);

}