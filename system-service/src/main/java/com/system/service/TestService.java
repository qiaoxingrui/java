package com.system.service;

import org.springframework.stereotype.Component;

import com.system.dao.TestDao;
import com.system.utils.TestUtil;
@Component
public class TestService {
	public String getService() {
		TestDao dao = new TestDao();
		TestUtil utils = new TestUtil();
		return "from service "+dao.getDao()+" "+utils.getUtil();
	}
	
}
