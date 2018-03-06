package com.wagashi.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.LoginDAO;
import com.wagashi.DTO.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware {

private String user_id;

private String password;

private String result;

public Map<String,Object> session;

private LoginDAO loginDAO = new LoginDAO();

private LoginDTO loginDTO = new LoginDTO();



	public String execute() {

		result = ERROR;

		loginDTO = loginDAO.getUserInfo(user_id,password);

		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			session.put("user_id",loginDTO.getLoginId());
			session.put("password",loginDTO.getLoginPassword());

			System.out.println(session.get("user_id").toString());

			return result;

		}

		return result;
	}



	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getResult() {
		return result;
	}



	public void setResult(String result) {
		this.result = result;
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


}
