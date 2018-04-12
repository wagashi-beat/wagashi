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
	private int id;
	private String addFlg;
	private String deleteFlg= "";

	CartDAO cartDAO = new CartDAO();

	private Collection<String> deleteList;
	//aaa


	public String execute() throws SQLException{
		String result= ERROR;

		//ログイン時の処理
		if(session.containsKey("user_id")){

			if(!(addFlg==null)){
				cartDAO.loginCartAdd(session.get("user_id").toString(), productId, productCount, price, id);
				cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());

				for(CartDTO dto: cartDTOList){
					if(dto.getProductId()== productId){
						int updateCount= productCount + dto.getProductCount();
						cartDAO.updateCartAdd(productId, session.get("user_id").toString(), updateCount);
						cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());

						result= SUCCESS;
						return result;
					}
				}
			}


			else if(deleteFlg != null && deleteList != null){
				cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());

					for(int i = 0; i < cartDTOList.size(); i++){
						if(deleteFlg != null){
							for(String check: deleteList){
								long id= Long.parseLong(check);
								cartDelete((int) id);
								cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());
								result= "cart";
							}
						}
						else{
							result= "cart";
						}
					}

				result= SUCCESS;
			}
		}





		//未ログイン時の処理
		if(session.containsKey("temp_user_id")){
			if(!(addFlg== null)){
				cartDAO.noLoginCartAdd(session.get("temp_user_id").toString(), productId, productCount, price);
				cartDTOList= cartDAO.noLoginGetCartInfo(session.get("temp_user_id").toString());

				for(CartDTO dto:cartDTOList){
					if(dto.getProductId()==productId){
						int updateCount = productCount + dto.getProductCount();
						cartDAO.noLoginUpdateCartAdd(productId, session.get("temp_user_id").toString(), updateCount);
						result= SUCCESS;
						return result;
					}
				}
			}

			else {
				for(int i = 0; i < cartDTOList.size(); i++){
					if(deleteFlg != null){
						for(String check: deleteList){
							int id= Integer.parseInt(check);
							cartDAO.loginCartDelete(session.get("user_id").toString(), id);
							result= "cart";
						}
					}
					else{
						result= "cart";
					}
				}

			result= SUCCESS;
			}
		}

		System.out.println(cartDTOList);
		return result;
	}

	public void cartDelete(int id) throws SQLException {
		cartDAO.loginCartDelete(session.get("user_id").toString(), id);
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


	public Collection<String> getDeleteList() {
		return deleteList;
	}


	public void setDeleteList(Collection<String> deleteList) {
		this.deleteList = deleteList;
	}


}
