package com.dtweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtweb.dao.CustomerDao;
import com.dtweb.model.Customer;
import com.dtweb.services.CustomerService;

/**
 * @author Thong
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customDao;
	public boolean checkCustomer(Customer custom) {		
		return customDao.checkCustomer(custom);
	}
	public Customer findByUsername(String username) {
		
		return customDao.findByUsername(username);
	}

	
}
