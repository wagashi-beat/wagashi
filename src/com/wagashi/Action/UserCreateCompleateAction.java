package com.wagashi.Action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.UserCreateDAO;
import com.wagashi.DTO.LoginDTO;

public class UserCreateCompleateAction extends ActionSupport implements SessionAware{

	// インスタンス化
	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String email;
	private LoginDTO dto= new LoginDTO();

	public Map<String, Object> session;
	private UserCreateDAO userCreateDAO= new UserCreateDAO();


	// 実行
	public String execute() throws SQLException {
		userCreateDAO.create(session.get("user_id").toString(),
				session.get("password").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				Integer.parseInt(session.get("sex").toString()),
				session.get("email").toString());

		dto.setLoginId(session.get("user_id").toString());

		String ret = SUCCESS;
		return ret;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFamilyName() {
		return familyName;
	}


	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getFamilyNameKana() {
		return familyNameKana;
	}


	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}


	public String getFirstNameKana() {
		return firstNameKana;
	}


	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public UserCreateDAO getUserCreateDAO() {
		return userCreateDAO;
	}


	public void setUserCreateDAO(UserCreateDAO userCreateDAO) {
		this.userCreateDAO = userCreateDAO;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public LoginDTO getDto() {
		return dto;
	}


	public void setDto(LoginDTO dto) {
		this.dto = dto;
	}


	public Map<String, Object> getSession() {
		return session;
	}


}

