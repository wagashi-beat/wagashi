package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.CartDAO;
import com.wagashi.DAO.DestinationDAO;
import com.wagashi.DTO.CartDTO;
import com.wagashi.DTO.MyPageDTO;


public class SettlementConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;

	private ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	private MyPageDTO myPageDTO = new MyPageDTO();

	private int totalPrice;
	DestinationDAO destinationDAO = new DestinationDAO();
	CartDAO cartDAO=new CartDAO();

	public String execute() throws SQLException {


		String result = ERROR;
		if(session.containsKey("user_id")){

			myPageDTO=destinationDAO.getDestination(session.get("user_id").toString());
			cartDTOList=cartDAO.loginGetCartInfo(session.get("user_id").toString());

			if(!(myPageDTO.getAddress() == null)){

				result = SUCCESS;

				for(CartDTO dto:cartDTOList){
					totalPrice+=dto.getPrice();

				}
				cartDTOList=cartDAO.loginGetCartInfo(session.get("user_id").toString());

				result= SUCCESS;
			}

			else if (myPageDTO.getAddress() == null){
				result= "Destination";
			}

			else if(cartDTOList== null) {
				result= "home";
			}
		}


		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public ArrayList<CartDTO> getCartDTOList() {
		return cartDTOList;
	}


	public void setCartDTOList(ArrayList<CartDTO> cartDTOList) {
		this.cartDTOList = cartDTOList;
	}



	public MyPageDTO getMyPageDTO() {
		return myPageDTO;
	}


	public void setMyPageDTO(MyPageDTO myPageDTO) {
		this.myPageDTO = myPageDTO;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


}
