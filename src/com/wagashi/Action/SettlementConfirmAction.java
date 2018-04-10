package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.CartDAO;
import com.wagashi.DAO.DestinationDAO;
import com.wagashi.DTO.CartDTO;
import com.wagashi.DTO.DestinationDTO;


public class SettlementConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;

	private ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	private DestinationDTO destinationDTO = new DestinationDTO();

	private int totalPrice;


	public String execute() throws SQLException {


		String result = ERROR;
		if(session.containsKey("user_id")){
			DestinationDAO destinationDAO = new DestinationDAO();
			destinationDTO=destinationDAO.getDestination(session.get("user_id").toString());
			System.out.println(destinationDTO.getAddress());

			if(!(destinationDTO.getAddress() == null)){
				CartDAO cartDAO=new CartDAO();
				cartDTOList=cartDAO.loginGetCartInfo(session.get("user_id").toString());
				result = SUCCESS;

				for(CartDTO dto:cartDTOList){
					totalPrice+=dto.getPrice();

				}
			}

			else if (destinationDTO.getAddress() == null){
				result= "Destination";
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


	public DestinationDTO getDestinationDTO() {
		return destinationDTO;
	}


	public void setDestinationDTO(DestinationDTO destinationDTO) {
		this.destinationDTO = destinationDTO;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
