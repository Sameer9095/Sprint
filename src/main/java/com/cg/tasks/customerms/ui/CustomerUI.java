package com.cg.tasks.customerms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.tasks.customerms.entities.*;
import com.cg.tasks.customerms.service.*;

@Component
public class CustomerUI {

	@Autowired
	ICustomerService service;

	public void start() {

		Customer sameer = service.createCustomer("Sameer");
		display(sameer);

		Customer mishra = service.createCustomer("Mishra");
		display(mishra);

		Customer findCustomer = service.findById(5L);
		display(findCustomer);

		Long sameerId = sameer.getId();
		Customer sameerAmount = service.addAmount(sameerId, 202.0);
		display(sameerAmount);

	}

	void display(Customer customer) {
		Account account = customer.getAccount();
		System.out.println("Customer Id " + customer.getId() + "\nCustomer Name " + customer.getName()
				+ " \n Customer Account Id  " + account.getAccountID() + "\n Account Balance " + account.getBalance()
				+ " \n Time Of Creation" + account.getCreated());
	}

}