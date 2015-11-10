/**
 * 
 */
package com.dtweb.dao.impl;



import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dtweb.dao.CustomerDao;
import com.dtweb.model.Customer;

/**
 * @author ThongNguyen
 *
 */
@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer> implements CustomerDao {

	public boolean checkCustomer(Customer custom) {
		String hql = "FROM Customer C WHERE C.username = :user AND C.password = :pass";
		Query query = entityManager.createQuery(hql);
		query.setParameter("user", custom.getUsername());
		query.setParameter("pass", custom.getPassword());
		List results = query.getResultList();
		
		if (!results.isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public Customer findByUsername(String username) {
		String hql = "FROM Customer C WHERE C.username = :user";
		Query query = entityManager.createQuery(hql);
		query.setParameter("user", username);
		List<Customer> results = (List<Customer>)query.getResultList();
		return results.isEmpty()?null:results.get(0);
	}

}
