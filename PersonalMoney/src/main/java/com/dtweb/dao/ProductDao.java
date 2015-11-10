package com.dtweb.dao;



import java.util.List;

import com.dtweb.model.Product;

public interface ProductDao extends GenericDao<Product>{
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	List<Product> searchProductByName(String key);
}
