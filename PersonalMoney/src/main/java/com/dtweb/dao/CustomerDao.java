package com.dtweb.dao;

import com.dtweb.model.Customer;

/**
 * @author Thong
 *
 */
public interface CustomerDao extends GenericDao<Customer> {
	boolean checkCustomer(Customer custom);
	
	/**
	 * @author DuongPV1
	 * */
	Customer findByUsername(String username);
}
