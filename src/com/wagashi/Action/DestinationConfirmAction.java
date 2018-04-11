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

	private String error;
	private String errorFamilyName;
	private String errorFirstName;
	private String errorFamilyNameKana;
	private String errorFirstNameKana;
	private String errorAddress;
	private String errorEmail;
	private String errorTelNumber;

	private  List<String> errorList= new ArrayList<>();
	private List<String> errorFamilyNameList = new ArrayList<>();
	private List<String> errorFirstNameList= new ArrayList<>();
	private List<String> errorFamilyNameKanaList = new ArrayList<>();
	private List<String> errorFirstNameKanaList = new ArrayList<>();
	private List<String> errorAddressList = new ArrayList<>();
	private List<String> errorEmailList = new ArrayList<>();
	private List<String> errorTelNumberList = new ArrayList<>();

	public String execute() throws SQLException {
		String result= ERROR;
		int errorCount= 0;

	// 姓
		if (familyName.equals("")) {
			errorFamilyName = "姓を入力してください。";
			errorFamilyNameList.add(errorFamilyName);
			errorCount++;
		}else if(familyName.length() < 1 || familyName.length() > 16){
			errorFamilyName = "姓は１文字以上１６文字以下で入力してください。";
			errorCount++;
		}else if (!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶー]+$")){
			errorFamilyName = "姓は半角英数、ひらがな、カタカナ、漢字で入力してください。";
			errorFamilyNameList.add(errorFamilyName);
			errorCount++;
		}

	//名
		if(firstName.equals("")){
			errorFirstName ="名前を入力してください。";
			errorFirstNameList.add(errorFirstName);
			errorCount++;
		}else if(firstName.length() < 1 || firstName.length() > 16) {
			errorFirstName = "名前は１文字以上１６文字以下";
			errorFirstNameList.add(errorFirstName);
			errorCount++;
		}else if(!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶー]+$")) {
			errorFirstName = "名前は半角英字、ひらがな、カタカナ、漢字で入力してください。";
			errorFirstNameList.add(errorFirstName);
			errorCount++;
		}
	//姓ふりがな
		if (!(familyName.matches("^[a-zA-Z]+$") && familyNameKana.equals(""))){
			if(familyNameKana.length()<1 || familyNameKana.length()>16){
				errorFamilyNameKana = "姓(ふりがな)は1文字以上１６文字以下で入力してください。";
				errorFamilyNameKanaList.add(errorFamilyNameKana);
				errorCount++;
			}

			if (!familyNameKana.matches("^[ぁ-ゞ]+$")) {
				errorFamilyNameKana = "姓(ふりがな)はひらがなで入力してください。";
				errorFamilyNameKanaList.add(errorFamilyNameKana);
				errorCount++;
			}
		}

	//名ふりがな
		if (!(firstName.matches("[a-zA-Z]+$")) && firstNameKana.equals("")){
			if(firstNameKana.length()<1 || firstNameKana.length()>16){
				errorFirstNameKana = "名(ふりがな)は1文字以上１６文字以下で入力してください。";
				errorFirstNameKanaList.add(errorFirstNameKana);
				errorCount++;
			}

			else if (!firstNameKana.matches("^[ぁ-ゞ]+$")) {
				errorFirstNameKana = "名(ふりがな)はひらがなで入力してください。";
				errorFirstNameKanaList.add(errorFirstNameKana);
			errorCount++;
			}
		}

	//住所
		if(address.equals("")) {
			errorAddress = "住所を入力してください。";
			errorAddressList.add(errorAddress);
			errorCount++;
		}else if(address.length() < 10 || familyNameKana.length() > 50){
			errorAddress = "住所は10文字以上50文字以下で入力してください。";
			errorAddressList.add(errorAddress);
			errorCount++;
		}else if(!address.matches("^[a-zA-Z0-9 -/:-@\\[-\\`\\{-\\~ぁ-ゞ一-龠々ァ-ヶー]+$")) {
			errorAddress = "住所は半角英数記号、ひらがな、カタカナ、漢字で入力してください。";
			errorAddressList.add(errorAddress);
			errorCount++;
		}

	//メールアドレス
		if(email.equals("")) {
			errorEmail = "メールアドレスを入力してください。";
			errorEmailList.add(errorEmail);
			errorCount++;
		}else if(email.length() < 10 || email.length() > 32){
			errorEmail = "メールアドレスは10文字以上32文字以下で入力してください。";
			errorEmailList.add(errorEmail);
			errorCount++;
		}else if(!email.matches("^[a-zA-Z0-9 -/:-@\\[-\\`\\{-\\~ぁ-ゞ一-龠々ァ-ヶー]+$")) {
			errorEmail = "正しいメールアドレスの形式で入力してください。";
			errorEmailList.add(errorEmail);
			errorCount++;
		}

	//電話番号
		if(telNumber.equals("")){
			errorTelNumber = "電話番号を入力してください。";
			errorTelNumberList.add(errorTelNumber);
			errorCount++;
		} else if(telNumber.length() < 10 || telNumber.length() > 13){
			errorTelNumber = "電話番号は10桁以上13桁以内で入力してください。";
			errorTelNumberList.add(errorTelNumber);
			errorCount++;
		} else if (!telNumber.matches("^[0-9]+$")) {
			errorTelNumber = "電話番号は半角数字で入力してください。";
			errorTelNumberList.add(errorTelNumber);
			errorCount++;
		}




		if (errorCount>0) {
			session.put("error", error);
			result= ERROR;
		}

		else {
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("telNumber", telNumber);
			session.put("email", email);
			session.put("address", address);


			result= SUCCESS;
		}

		return result;
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

	public List<String> getErrorFamilyNameList() {
		return errorFamilyNameList;
	}



	public void setErrorFamilyNameList(List<String> errorFamilyNameList) {
		this.errorFamilyNameList = errorFamilyNameList;
	}



	public List<String> getErrorFirstNameList() {
		return errorFirstNameList;
	}



	public void setErrorFirstNameList(List<String> errorFirstNameList) {
		this.errorFirstNameList = errorFirstNameList;
	}



	public List<String> getErrorFamilyNameKanaList() {
		return errorFamilyNameKanaList;
	}



	public void setErrorFamilyNameKanaList(List<String> errorFamilyNameKanaList) {
		this.errorFamilyNameKanaList = errorFamilyNameKanaList;
	}



	public List<String> getErrorFirstNameKanaList() {
		return errorFirstNameKanaList;
	}



	public void setErrorFirstNameKanaList(List<String> errorFirstNameKanaList) {
		this.errorFirstNameKanaList = errorFirstNameKanaList;
	}



	public List<String> getErrorAddressList() {
		return errorAddressList;
	}



	public void setErrorAddressList(List<String> errorAddressList) {
		this.errorAddressList = errorAddressList;
	}



	public List<String> getErrorEmailList() {
		return errorEmailList;
	}



	public void setErrorEmailList(List<String> errorEmailList) {
		this.errorEmailList = errorEmailList;
	}



	public List<String> getErrorTelNumberList() {
		return errorTelNumberList;
	}



	public void setErrorTelNumberList(List<String> errorTelNumberList) {
		this.errorTelNumberList = errorTelNumberList;
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
