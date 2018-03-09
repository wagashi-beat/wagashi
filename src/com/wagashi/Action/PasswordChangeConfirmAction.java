package com.wagashi.Action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.LoginDAO;
import com.wagashi.DTO.LoginDTO;

public class PasswordChangeConfirmAction extends ActionSupport implements SessionAware {
	private String userId;
	private String newPassword;

	public Map<String, Object> session;
	private LoginDTO loginDTO= new LoginDTO();
	private LoginDAO loginDAO= new LoginDAO();


	public String execute() throws SQLException {
		String ret= ERROR;
		int errorCount= 0;

		if(userId.equals("") || newPassword.equals("")){
			errorCount++;
		}

		else {
			session.put("newPassword", newPassword);

			if (!userId.equals(loginDTO.getLoginId())) {
				errorCount++;
			}
		}

		if (errorCount>0) {
			ret= ERROR;
		}

		else {
			session.put("newPassword", newPassword);
			ret= SUCCESS;
		}

		return ret;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}


	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}


	public LoginDAO getLoginDAO() {
		return loginDAO;
	}


	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}






}
