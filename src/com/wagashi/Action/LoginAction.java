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

public class LoginAction extends ActionSupport implements SessionAware {

private String user_id;

private String password;

private String result;

public Map<String,Object> session;

private LoginDAO loginDAO = new LoginDAO();

private LoginDTO loginDTO = new LoginDTO();

private ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

private ArrayList<CartDTO> loginCartDTOList = new ArrayList<CartDTO>();



	public String execute() throws SQLException {

		result = ERROR;

		if(session.containsKey("user_id")){
			result = ERROR;
			return result;
		}


		loginDTO = loginDAO.getUserInfo(user_id,password);

		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			session.put("user_id",loginDTO.getLoginId());
			session.put("password",loginDTO.getLoginPassword());

			System.out.println(session.get("user_id").toString());
			//未ログイン時のカート情報統合
			CartDAO cartDAO = new CartDAO();
			cartDTOList=cartDAO.noLoginGetCartInfo(session.get("tempUserId").toString());
			loginCartDTOList=cartDAO.loginGetCartInfo(session.get("user_id").toString());
			if(!(cartDTOList==null)){

				for(CartDTO dto:cartDTOList){
					for(CartDTO lcdto:loginCartDTOList){
						if(dto.getProductId()==lcdto.getProductId()){
							int updateCount=dto.getProductCount()+lcdto.getProductCount();
							cartDAO.updateCartAdd(session.get("user_id").toString(),dto.getProductId(), updateCount);
							dto=null;
						}
					}
					if(!(dto==null)){
						cartDAO.loginCartAdd(session.get("user_id").toString(), dto.getProductId(), dto.getProductCount(), dto.getPrice());
						}

				}
			}
			session.remove("tempUserId");

			return result;

		}


		return result;
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

}
//aa
