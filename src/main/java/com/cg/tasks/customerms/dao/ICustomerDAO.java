package com.cg.tasks.customerms.dao;

import com.cg.tasks.customerms.entities.*;

public interface ICustomerDAO {

	public Customer add(Customer customer);

	public Customer findById(long customerId);

	public Customer update(Customer customer);

}
