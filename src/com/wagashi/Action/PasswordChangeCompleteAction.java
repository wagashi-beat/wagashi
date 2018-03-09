package com.wagashi.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.PasswordChangeDAO;

public class PasswordChangeCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private PasswordChangeDAO passwordChangeDAO= new PasswordChangeDAO();

	public String execute() {
		passwordChangeDAO.newPassword(session.get("newPassword").toString(), session.get("userId").toString());
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public PasswordChangeDAO getPasswordChangeDAO() {
		return passwordChangeDAO;
	}

	public void setPasswordChangeDAO(PasswordChangeDAO passwordChangeDAO) {
		this.passwordChangeDAO = passwordChangeDAO;
	}


}
