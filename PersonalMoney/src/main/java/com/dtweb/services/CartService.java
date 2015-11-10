package com.dtweb.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dtweb.dto.CartDTO;
import com.dtweb.dto.CustomerDTO;

/**
 * @author DuongPV1
 * 
 * */
public interface CartService {
	/**
	 * @author DuongPV1
	 * 
	 * */
	void addCart(int id, int quantity);
	/**
	 * @author DuongPV1
	 * 
	 * */
	void removeCart(int id);
	/**
	 * @author DuongPV1
	 * 
	 * */
	void payment();
	/**
	 * @author DuongPV1
	 * 
	 * */
	void setSession(HttpSession session);
	/**
	 * @author DuongPV1
	 * 
	 * */
	void changeQuantity(int id, int quantity);
	/**
	 * @author DuongPV1
	 * @return 
	 * 
	 * */
	CartDTO getCartDTO();
	
	/**
	 * @author DuongPV1
	 * @return 
	 * 
	 * */
	void update(HttpServletRequest request);
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	boolean checkEmptyCart();
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	void order(CustomerDTO customer);
}
