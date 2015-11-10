package com.dtweb.services.impl;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtweb.dao.MenuDao;
import com.dtweb.model.Menu;
import com.dtweb.services.MenuService;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuDao menuDao;
	public List<Menu> getMenu() {
		List<Menu> listMenu1=menuDao.getMenuActive();
		List<Menu> listMenu2=new ArrayList<Menu>();
		for(Menu m:listMenu1){
			if(m.getParent()==null){
				listMenu2.add(m);
			}
		}
		return listMenu2;
	}

}
