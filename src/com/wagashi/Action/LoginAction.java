package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.CartDAO;
import com.wagashi.DAO.LoginDAO;
import com.wagashi.DTO.CartDTO;
import com.wagashi.DTO.LoginDTO;
import com.wagashi.DTO.MyPageDTO;

public class LoginAction extends ActionSupport implements SessionAware {

private String user_id;

private String password;

private String errorId;

private String errorId1;

private String errorId2;

private String errorId3;

private String errorPassword;

private String errorPassword1;

private String errorPassword2;

private String errorMessage;


private String result;

public Map<String,Object> session;

private LoginDAO loginDAO = new LoginDAO();

private LoginDTO loginDTO = new LoginDTO();

private MyPageDTO myPageDTO= new MyPageDTO();

private ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

private ArrayList<CartDTO> loginCartDTOList = new ArrayList<CartDTO>();



	public String execute() throws SQLException {

		result = ERROR;
		int ErrorCount= 0;

		//未入力メッセージ

		if(user_id.equals("")) {
			setErrorId("IDを入力してください");
			ErrorCount++;
		}

		if(password.equals("")) {
			setErrorPassword("パスワードを入力してください");
			ErrorCount++;
		}


		//文字エラーメッセージ


		if(user_id.length()<1||user_id.length()>8 && !user_id.equals("")){
			setErrorId1("IDは１文字以上８文字以下で入力してください");
			ErrorCount++;
		}

		if (!user_id.matches("^[0-9a-zA-Z]+$") && !(user_id.equals(""))) {
			setErrorId2("IDは半角英数字で入力してください");
			ErrorCount++;
		}

		if(password.length()<1||password.length()>16 && !password.equals("")){
			setErrorPassword1("１文字以上１６文字以内で入力してください");
			ErrorCount++;
		}

		if (!password.matches("^[0-9a-zA-Z]+$") && !(user_id.equals(""))) {
			setErrorPassword2("IDは半角英数字で入力してください");
			ErrorCount++;
		}

		if(ErrorCount>0) {
			result = ERROR;
			return result;
		}


		loginDTO = loginDAO.getUserInfo(user_id, password);
		session.put("loginUser", loginDTO);
		System.out.println(session.get("loginUser"));

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			session.put("user_id",loginDTO.getLoginId());
			session.put("password",loginDTO.getLoginPassword());

			session.put("myPageFam", myPageDTO.getFamilyName());
			session.put("myPageFir", myPageDTO.getFirstName());
			session.put("myPageFamKana", myPageDTO.getFamilyNameKana());
			session.put("myPageFirKana", myPageDTO.getFirstNameKana());
			session.put("myPageAdd", myPageDTO.getAddress());
			session.put("myPageEmail", myPageDTO.getEmail());
			session.put("myPageTel", myPageDTO.getTelNumber());



			System.out.println(session.get("user_id").toString());

			//未ログイン時のカート情報統合
			  CartDAO cartDAO = new CartDAO();
			cartDTOList=cartDAO.noLoginGetCartInfo(session.get("temp_user_id").toString());
			loginCartDTOList=cartDAO.loginGetCartInfo(session.get("user_id").toString());
			if(!(cartDTOList==null)){

				for(CartDTO dto:cartDTOList){
					for(CartDTO lcdto:loginCartDTOList){
						if(dto.getProductId()==lcdto.getProductId()){
							int updateCount=dto.getProductCount()+lcdto.getProductCount();
							cartDAO.updateCartAdd(dto.getProductId(),session.get("user_id").toString(), updateCount);
							dto=null;

							result= SUCCESS;
						}
					}

					if(!(dto==null)){
						cartDAO.loginCartAdd(session.get("user_id").toString(), dto.getProductId(), dto.getProductCount(), dto.getPrice());
						result= SUCCESS;
					}

				}
			}

			else {
				result= SUCCESS;
			}


			session.remove("temp_user_id");
			return result;

		}
		else {
			setErrorMessage("IDまたはパスワードが異なるよ～(○・▽・○)");
			result= ERROR;
			return result;

		}

	}

	public String getErrorId() {
		return errorId;
	}

	public String getErrorId1() {
		return errorId1;
	}

	public String getErrorId2() {
		return errorId2;
	}

	public String getErrorId3() {
		return errorId3;
	}

	public String getErrorPassword() {
		return errorPassword;
	}

	public String getErrorPassword1() {
		return errorPassword1;
	}

	public String getErrorPassword2() {
		return errorPassword2;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public void setErrorId1(String errorId1) {
		this.errorId1 = errorId1;
	}

	public void setErrorId2(String errorId2) {
		this.errorId2 = errorId2;
	}

	public void setErrorId3(String errorId3) {
		this.errorId3 = errorId3;
	}

	public void setErrorPassword(String errorPassword) {
		this.errorPassword = errorPassword;
	}

	public void setErrorPassword1(String errorPassword1) {
		this.errorPassword1 = errorPassword1;
	}

	public void setErrorPassword2(String errorPassword2) {
		this.errorPassword2 = errorPassword2;
	}

	public ArrayList<CartDTO> getLoginCartDTOList() {
		return loginCartDTOList;
	}

	public void setLoginCartDTOList(ArrayList<CartDTO> loginCartDTOList) {
		this.loginCartDTOList = loginCartDTOList;
	}



	public ArrayList<CartDTO> getCartDTOList() {
		return cartDTOList;
	}

	public void setCartDTOList(ArrayList<CartDTO> cartDTOList) {
		this.cartDTOList = cartDTOList;
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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
//aa
