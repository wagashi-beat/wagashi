package com.wagashi.Action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.LoginDAO;
import com.wagashi.DTO.MyPageDTO;

public class PasswordChangeConfirmAction extends ActionSupport implements SessionAware {
	private String userId;
	private String newPassword;

	public Map<String, Object> session;
	private MyPageDTO myPageDTO= new MyPageDTO();
	private LoginDAO loginDAO= new LoginDAO();


	public String execute() throws SQLException {
		String ret= ERROR;
		int errorCount= 0;

		if(userId.equals("") || newPassword.equals("")){
			errorCount++;
		}

		else {
			if (!(loginDAO.userCheck(userId)>0)) {
				errorCount++;
			}
		}

		if (errorCount>0) {
			ret= ERROR;
		}

		else {
			session.put("userId", userId);
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


	public LoginDAO getLoginDAO() {
		return loginDAO;
	}


	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}


	public MyPageDTO getMyPageDTO() {
		return myPageDTO;
	}


	public void setMyPageDTO(MyPageDTO myPageDTO) {
		this.myPageDTO = myPageDTO;
	}
}
