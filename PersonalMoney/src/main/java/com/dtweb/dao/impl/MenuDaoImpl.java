package com.dtweb.dao.impl;


import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dtweb.dao.MenuDao;
import com.dtweb.model.Menu;

@Repository
public class MenuDaoImpl extends GenericDaoImpl<Menu> implements MenuDao {

	public List<Menu> getMenuActive() {
		Query q=entityManager.createQuery("from Menu m where m.active=1");
		List l=q.getResultList();
		return l;
	}



}
