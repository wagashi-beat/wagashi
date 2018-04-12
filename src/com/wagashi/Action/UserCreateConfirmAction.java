package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.UserCreateDAO;
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

	UserCreateDAO dao= new UserCreateDAO();
	LoginDTO loginDTO= new LoginDTO();

	// エラーリスト
	private List<String> errorList= new ArrayList<>();
	private List<String> errorIdList= new ArrayList<>();
	private List<String> errorPasswordList= new ArrayList<>();
	private List<String> errorFamilyList= new ArrayList<>();
	private List<String> errorFirstList= new ArrayList<>();
	private List<String> errorFamilyKanaList= new ArrayList<>();
	private List<String> errorFirstKanaList= new ArrayList<>();
	private List<String> errorEmailList= new ArrayList<>();

	// エラー
	private String error;
	private String errorId;
	private String errorPassword;
	private String errorFamily;
	private String errorFirst;
	private String errorFamilyKana;
	private String errorFirstKana;
	private String errorEmail;

	// 実行
	public String execute() throws SQLException {
		String ret= ERROR;
		int errorCount= 0;


		// エラー
		if (user_id.equals("") || password.equals("") ||
				familyName.equals("") || firstName.equals("") ||
				email.equals("") ||
				(!(familyName.matches("^[a-zA-Z]+$")) && familyNameKana.equals("")) ||
				(!(firstName.matches("[a-zA-Z]+$")) && firstNameKana.equals(""))) {
					error= "未入力項目があります。";
					session.put("error", error);
					errorCount++;
				}

		else {
			// ユーザーID
			if (dao.checkId(user_id)) {
				error= "そのIDは既に登録されています。";
				errorList.add(errorId);
				errorCount++;
			}

			if (user_id.length()<3 || user_id.length()>8) {
				errorId= "3文字以上8文字以内で入力してください。";
				errorIdList.add(errorId);
				errorCount++;
			}

			if (!user_id.matches("^[0-9a-zA-Z]+$")) {
				errorId= "半角英数字で入力してください。";
				errorIdList.add(errorId);
				errorCount++;
			}


			// パスワード
			if (password.equals(user_id)) {
				errorPassword= "ユーザーIDをパスワードとして使用できません。";
				errorPasswordList.add(errorPassword);
				errorCount++;
			}

			if (password.length()<3 || password.length()>16) {
				errorPassword= "3文字以上16文字以内で入力してください。";
				errorPasswordList.add(errorPassword);
				errorCount++;
			}

			if (!password.matches("^[0-9a-zA-Z]+$")) {
				errorPassword= "半角英数字で入力してください。";
				errorPasswordList.add(errorPassword);
				errorCount++;
			}



			// 性
			if (familyName.length()<1 || familyName.length()>16) {
				errorFamily= "1文字以上16文字以内で入力してください。";
				errorFamilyList.add(errorFamily);
				errorCount++;
			}

			if (!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")) {
				errorFamily = "半角英字、ひらがな、カタカナ、漢字で入力してください。";
				errorFamilyList.add(errorFamily);
				errorCount++;
			}



			// 名
			if(firstName.length()<1 || firstName.length()>16){
				errorFirst ="1文字以上16文字以下で入力してください。";
				errorFirstList.add(errorFirst);
				errorCount++;
			}

			if (!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")) {
				errorFirst = "半角英字、ひらがな、カタカナ、漢字で入力してください。";
				errorFirstList.add(errorFirst);
				errorCount++;
			}



			//姓ふりがな
			if (!(familyName.matches("^[a-zA-Z]+$") && familyNameKana.equals(""))){
				if(familyNameKana.length()<1 || familyNameKana.length()>16){
					errorFamilyKana = "1文字以上16文字以下で入力してください。";
					errorFamilyKanaList.add(errorFamilyKana);
					errorCount++;
				}

				if (!familyNameKana.matches("^[ぁ-ゞ]+$")) {
					errorFamilyKana = "ひらがなで入力してください。";
					errorFamilyKanaList.add(errorFamilyKana);
					errorCount++;
				}
			}



			//名前ふりがな
			if (!(firstName.matches("[a-zA-Z]+$")) && firstNameKana.equals("")){
				if(firstNameKana.length()<1 || firstNameKana.length()>16){
					errorFirstKana = "1文字以上16文字以下で入力してください。";
					errorFirstKanaList.add(errorFirstKana);
					errorCount++;
				}

				else if (!firstNameKana.matches("^[ぁ-ゞ]+$")) {
				errorFirstKana = "ひらがなで入力してください。";
				errorFirstKanaList.add(errorFirstKana);
				errorCount++;
				}
			}



			//メール
			if(email.length()<11 || email.length()>32){
				errorEmail = "11文字以上32文字以下で入力してください。";
				errorEmailList.add(errorEmail);
				errorCount++;
			}

			if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
				errorEmail = "正しいメールアドレスの形式で入力してください。";
				errorEmailList.add(errorEmail);
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




	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	String getPassword() {
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




	public List<String> getErrorIdList() {
		return errorIdList;
	}




	public void setErrorIdList(List<String> errorIdList) {
		this.errorIdList = errorIdList;
	}




	public List<String> getErrorPasswordList() {
		return errorPasswordList;
	}




	public void setErrorPasswordList(List<String> errorPasswordList) {
		this.errorPasswordList = errorPasswordList;
	}




	public List<String> getErrorFamilyList() {
		return errorFamilyList;
	}




	public void setErrorFamilyList(List<String> errorFamilyList) {
		this.errorFamilyList = errorFamilyList;
	}




	public List<String> getErrorFirstList() {
		return errorFirstList;
	}




	public void setErrorFirstList(List<String> errorFirstList) {
		this.errorFirstList = errorFirstList;
	}




	public List<String> getErrorFamilyKanaList() {
		return errorFamilyKanaList;
	}




	public void setErrorFamilyKanaList(List<String> errorFamilyKanaList) {
		this.errorFamilyKanaList = errorFamilyKanaList;
	}




	public List<String> getErrorFirstKanaList() {
		return errorFirstKanaList;
	}




	public void setErrorFirstKanaList(List<String> errorFirstKanaList) {
		this.errorFirstKanaList = errorFirstKanaList;
	}




	public List<String> getErrorEmailList() {
		return errorEmailList;
	}




	public void setErrorEmailList(List<String> errorEmailList) {
		this.errorEmailList = errorEmailList;
	}




	public String getErrorId() {
		return errorId;
	}




	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}




	public String getErrorPassword() {
		return errorPassword;
	}




	public void setErrorPassword(String errorPassword) {
		this.errorPassword = errorPassword;
	}




	public String getErrorFamily() {
		return errorFamily;
	}




	public void setErrorFamily(String errorFamily) {
		this.errorFamily = errorFamily;
	}




	public String getErrorFirst() {
		return errorFirst;
	}




	public void setErrorFirst(String errorFirst) {
		this.errorFirst = errorFirst;
	}




	public String getErrorFamilyKana() {
		return errorFamilyKana;
	}




	public void setErrorFamilyKana(String errorFamilyKana) {
		this.errorFamilyKana = errorFamilyKana;
	}




	public String getErrorFirstKana() {
		return errorFirstKana;
	}




	public void setErrorFirstKana(String errorFirstKana) {
		this.errorFirstKana = errorFirstKana;
	}




	public String getErrorEmail() {
		return errorEmail;
	}




	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}






}