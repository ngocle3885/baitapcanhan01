package com.dtweb.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dtweb.dao.ProductDao;
import com.dtweb.model.Product;

@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao{

	public List<Product> searchProductByName(String key) {
		String sql="from Product p where p.name like :key";
		Query query= entityManager.createQuery(sql);
		query.setParameter("key", "%"+key+"%");
		List<Product> list=query.getResultList();
		return list;
	}

}
