package com.dtweb.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtweb.dao.ConfigSysDao;
import com.dtweb.model.ConfigSys;
import com.dtweb.services.ConfigSysService;

@Service
@Transactional
public class ConfigSysServiceImpl implements ConfigSysService {

	@Autowired
	ConfigSysDao configDao;
	public Map<String, String> getConfig() {
		Map<String,String> map=new HashMap<String, String>();
		List<ConfigSys> listConfig=configDao.findAll();
		for(ConfigSys s:listConfig){
			map.put(s.getName(), s.getValue());
		}
		return map;
	}

}
