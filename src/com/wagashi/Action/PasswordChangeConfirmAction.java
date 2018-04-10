package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.LoginDAO;
import com.wagashi.DTO.MyPageDTO;

public class PasswordChangeConfirmAction extends ActionSupport implements SessionAware {
	private String userId;
	private String newPassword;
	private String errorNew;
	private String errorNewId;
	private String errorNewPass;
	private List<String> errorNewIdList= new ArrayList<>();
	private List<String> errorNewPassList= new ArrayList<>();

	public Map<String, Object> session;
	private MyPageDTO myPageDTO= new MyPageDTO();
	private LoginDAO loginDAO= new LoginDAO();


	public String execute() throws SQLException {
		String ret= ERROR;
		int errorCount= 0;

		if(userId.equals("") || newPassword.equals("")){
			errorNew= "未入力項目があるよ～(○・▽・○)";
			session.put("errorNew", errorNew);
			errorCount++;
		}

		else {
			if (!(loginDAO.userCheck(userId)>0)) {
				errorNewId= "入力されたIDが違うよ～(○・▽・○)";
				errorNewIdList.add(errorNewId);
				errorCount++;
			}

			if (newPassword.equals(userId)) {
				errorNewPass= "ユーザーIDをパスワードとして使用できません。";
				errorNewPassList.add(errorNewPass);
				errorCount++;
			}

			if (newPassword.length()<3 || newPassword.length()>16) {
				errorNewPass= "パスワードは3文字以上16文字以内で入力してください。";
				errorNewPassList.add(errorNewPass);
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




	public String getErrorNew() {
		return errorNew;
	}




	public void setErrorNew(String errorNew) {
		this.errorNew = errorNew;
	}




	public String getErrorNewId() {
		return errorNewId;
	}




	public void setErrorNewId(String errorNewId) {
		this.errorNewId = errorNewId;
	}




	public String getErrorNewPass() {
		return errorNewPass;
	}




	public void setErrorNewPass(String errorNewPass) {
		this.errorNewPass = errorNewPass;
	}




	public List<String> getErrorNewIdList() {
		return errorNewIdList;
	}




	public void setErrorNewIdList(List<String> errorNewIdList) {
		this.errorNewIdList = errorNewIdList;
	}




	public List<String> getErrorNewPassList() {
		return errorNewPassList;
	}




	public void setErrorNewPassList(List<String> errorNewPassList) {
		this.errorNewPassList = errorNewPassList;
	}



}
