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
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

	private int product_id;
	private int productCount;
	private int price;
	private int id;
	private String addFlg;
	private String deleteFlg= "";

	CartDAO cartDAO = new CartDAO();
	CartDTO cartDTO= new CartDTO();

	private Collection<String> deleteList;
	public String execute() throws SQLException{
		String result= ERROR;

		//ログイン時の処理


		if(session.containsKey("user_id")) {
			if (!(addFlg== null)) {
				cartDAO.loginCartAdd(session.get("user_id").toString(), product_id, productCount, price);
				cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());

				for (CartDTO dto: cartDTOList) {
					if (dto.getProduct_id() == product_id) {
						int updateCount= productCount + dto.getProductCount();
						cartDAO.updateCartAdd(updateCount, session.get("user_id").toString(), product_id);

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
							}
						}
						else{
							cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());
						}
					}
				result= SUCCESS;
			}

			else {
				cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());
				for(CartDTO dto: cartDTOList){
					if(dto.getProductId()== product_id){
						cartDTOList= cartDAO.loginGetCartInfo(session.get("user_id").toString());


					}
				}
				result= SUCCESS;
				return result;
			}
			}
		result= SUCCESS;
		return result;
		}



		/*//未ログイン時の処理
		if(session.containsKey("temp_user_id")){
			if(!(addFlg== null)){
				cartDAO.noLoginCartAdd(session.get("temp_user_id").toString(), product_id, productCount, price);
				cartDTOList= cartDAO.noLoginGetCartInfo(session.get("temp_user_id").toString());

				for(CartDTO dto:cartDTOList){
					if(dto.getProductId()==product_id){
						int updateCount = productCount + dto.getProductCount();
						cartDAO.noLoginUpdateCartAdd(product_id, session.get("temp_user_id").toString(), updateCount);
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
						}
					}
				}

			result= SUCCESS;
			}
		}

		result= SUCCESS;
		return result;
	} */

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


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CartDTO getCartDTO() {
		return cartDTO;
	}

	public void setCartDTO(CartDTO cartDTO) {
		this.cartDTO = cartDTO;
	}



	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}



	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}





}
