package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DestinationConfirmAction extends ActionSupport implements SessionAware{

	// インスタンス化
	private String user_id;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String telNumber;
	private String email;
	private String address;

	public Map<String, Object> session;

	private  List<String> errorList= new ArrayList<>();
	private String error;

	public String execute() throws SQLException {
		String ret= ERROR;
		int errorCount= 0;

		if (familyName.equals("") ||
				firstName.equals("") ||
				familyNameKana.equals("") ||
				firstNameKana.equals("") ||
				telNumber.equals("") ||
				email.equals("") ||
				address.equals("")) {
			error= "未入力項目があります。";
			errorList.add(error);
			errorCount++;
		}

		if (errorCount>0) {
			session.put("error", error);
			ret= ERROR;
		}

		else {
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("telNumber", telNumber);
			session.put("email", email);
			session.put("address", address);


			ret= SUCCESS;
		}

		return ret;
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

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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



	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



}
