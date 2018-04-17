package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.CartDAO;
import com.wagashi.DAO.SettlementDAO;
import com.wagashi.DTO.CartDTO;


public class SettlementCompleateAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private ArrayList<CartDTO> cartDTOList= new ArrayList<CartDTO>();
	private CartDAO cartDAO= new CartDAO();
	private SettlementDAO settlementDAO= new SettlementDAO();
	private String imageFilePath;


	public String execute() throws SQLException {
		String ret= ERROR;

		if (session.containsKey("user_id")){
			cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());

			// cart情報登録
			for (CartDTO dto: cartDTOList){
				settlementDAO.settlementComp(session.get("user_id").toString(),
						dto.getProduct_id(),
						dto.getProductCount(),
						dto.getPrice());
			}

			// cart情報削除
			settlementDAO.cartDelete(session.get("user_id").toString());

			ret= SUCCESS;
			return ret;
			}
		ret= SUCCESS;
			return ret;
		}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public SettlementDAO getSettlementDAO() {
		return settlementDAO;
	}

	public void setSettlementDAO(SettlementDAO settlementDAO) {
		this.settlementDAO = settlementDAO;
	}

	public ArrayList<CartDTO> getCartDTOList() {
		return cartDTOList;
	}

	public void setCartDTOList(ArrayList<CartDTO> cartDTOList) {
		this.cartDTOList = cartDTOList;
	}

	public CartDAO getCartDAO() {
		return cartDAO;
	}

	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}



}
