package com.wagashi.Action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.util.RandomId;

public class StartAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;

	public String execute(){

		RandomId randomId = new RandomId();

		session.clear();

		session.put("tempUserId", randomId.getTempUserId());

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
