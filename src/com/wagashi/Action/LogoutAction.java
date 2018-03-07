package com.wagashi.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	public String execute() {
		String ret= SUCCESS;
		session.clear();
		return ret;

	}


	public void setSession(Map<String, Object> session) {
		this.session= session;
	}

}
