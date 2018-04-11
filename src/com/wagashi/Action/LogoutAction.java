package com.wagashi.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.util.RandomId;

public class LogoutAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	public String execute() {
		String ret= SUCCESS;
		RandomId randomId = new RandomId();

		session.clear();

		session.put("temp_user_id", randomId.getTempUserId());
		return ret;

	}


	public void setSession(Map<String, Object> session) {
		this.session= session;
	}

}
