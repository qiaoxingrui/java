package com.system.web.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.system.service.TestService;

public class TestAction extends ActionSupport {
	@Autowired
	private TestService testService;
	

	public TestService getTestService() {
		return testService;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String index() {
		System.out.println(testService.getService());
		System.out.println("abc");
		return "index";
	}

}
