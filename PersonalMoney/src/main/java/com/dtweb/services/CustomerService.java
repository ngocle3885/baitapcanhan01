package com.dtweb.services;

import com.dtweb.model.Customer;

public interface CustomerService {
	/**
	 * use to check customer 
	 * @param custom
	 * @return true if userName and password are correct
	 * otherwise return false.
	 */
	boolean checkCustomer(Customer custom);

	/**
	 * @author DuongPV1
	 * */
	Customer findByUsername(String username);
}
