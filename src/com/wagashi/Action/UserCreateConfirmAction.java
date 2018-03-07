package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DTO.LoginDTO;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	// インスタンス化
	private String user_id;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String sexNum;
	private String email;

	public Map<String, Object> session;

	LoginDTO loginDTO= new LoginDTO();

	// エラーメッセージ
	private List<String> errorList= new ArrayList<>();
	private String error;



	// 実行
	public String execute() throws SQLException {
		String ret= ERROR;
		int errorCount= 0;

		if (user_id.equals("") || password.equals("") ||
				familyName.equals("") || firstName.equals("") ||
				familyNameKana.equals("") || firstNameKana.equals("") ||
				email.equals("")) {
			ret= ERROR;
			error= "未入力項目があります。";
			errorList.add(error);
			errorCount++;

		}

		else {
			if  (user_id.equals(loginDTO.getLoginId())) {
				error= "そのIDは既に登録されています。";
				errorList.add(error);
				errorCount++;
			}
		}

		if (errorCount>0) {
			session.put("error", error);
			ret= ERROR;
		}

		else {
			session.put("user_id", user_id);
			session.put("password", password);
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("sex", sex);
			session.put("email", email);

			ret= SUCCESS;
		}

		return ret;
	}




	public String getPassword() {
		return password;
	}
	public void setPassword (String password) {
		this.password= password;
	}



	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName (String familyName) {
		this.familyName= familyName;
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


	public String getSexNum() {
		return sexNum;
	}


	public void setSexNum(String sexNum) {
		this.sexNum = sexNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public List<String> getErrorList() {
		return errorList;
	}


	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}


	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}




	public String getUser_id() {
		return user_id;
	}




	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}