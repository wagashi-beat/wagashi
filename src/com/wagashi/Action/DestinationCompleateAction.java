package com.wagashi.Action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.DestinationDAO;

public class DestinationCompleateAction extends ActionSupport implements SessionAware {
	private String user_id;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String telNumber;
	private String email;
	private String address;

	public Map<String, Object> session;
	private DestinationDAO dao= new DestinationDAO();

	public String execute() throws SQLException {
		dao.destinationCreate(
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				session.get("address").toString(),
				session.get("telNumber").toString(),
				session.get("email").toString(),
				session.get("user_id").toString());

		String ret= SUCCESS;

		return ret;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUserId(String user_id) {
		this.user_id = user_id;
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

	public DestinationDAO getDao() {
		return dao;
	}

	public void setDao(DestinationDAO dao) {
		this.dao = dao;
	}




}
