package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.CartDAO;
import com.wagashi.DTO.CartDTO;

public class CartAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	private ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	private int productId;

	private int productCount;

	private int price;

	private String addFlg;

	private String deleteFlg;

	private Collection<String> deleteList;


	public String execute() throws SQLException{
		String result=ERROR;

		CartDAO cartDAO = new CartDAO();

		//ログイン時の処理
		if(session.containsKey("user_id")){

			if(!(addFlg==null)){

				cartDAO.loginCartAdd(session.get("userId").toString(), productId, productCount, price);
			}else if(!(deleteFlg==null)&&!(deleteList==null)){

				for(String check:deleteList){
					int id=Integer.parseInt(check);
					cartDAO.loginCartDelete(session.get("userId").toString(), id);
				}
			}

			cartDTOList=cartDAO.loginGetCartInfo(session.get("userId").toString());
			result = SUCCESS;
		}
		//未ログイン時の処理
		if(!(session.containsKey("userId"))){
			if(!(addFlg==null)){
				cartDAO.noLoginCartAdd(session.get("tempUserId").toString(), productId, productCount, price);
			}else if(!(deleteFlg==null)){
				cartDAO.noLoginCartDelete(session.get("tempUserId").toString(), productId);
			}

			cartDTOList=cartDAO.noLoginGetCartInfo(session.get("tempUserId").toString());
			result=SUCCESS;
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


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getProductCount() {
		return productCount;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAddFlg() {
		return addFlg;
	}


	public void setAddFlg(String addFlg) {
		this.addFlg = addFlg;
	}


	public String getDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


}
