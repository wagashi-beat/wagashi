package com.wagashi.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DTO.LoginDTO;
import com.wagashi.util.RandomId;

public class LogoutAction extends ActionSupport implements SessionAware{
	private LoginDTO loginDTO = new LoginDTO();
	private Map<String, Object> session;

	public String execute() {

		RandomId randomId = new RandomId();
		String loginUserId= session.get("user_id").toString();
		boolean loginMemory = session.get("loginMemory").equals(true);
		loginDTO.setLoginId(session.get("user_id").toString());

		session.clear();

		if (loginMemory) {
			session.put("loginMemoryId", loginUserId);
		}

		session.put("temp_user_id", randomId.getTempUserId());

		String ret= SUCCESS;
		return ret;


	}


	public void setSession(Map<String, Object> session) {
		this.session= session;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}


	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}




	public Map<String, Object> getSession() {
		return session;
	}



}
