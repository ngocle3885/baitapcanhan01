package com.dtweb.dao;

import java.util.List;

import com.dtweb.model.Menu;

public interface MenuDao extends GenericDao<Menu> {
	List<Menu> getMenuActive();
}
