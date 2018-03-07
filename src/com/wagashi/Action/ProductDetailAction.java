package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.ProductDetailDAO;
import com.wagashi.DTO.ProductInfoDTO;

public class ProductDetailAction extends ActionSupport implements SessionAware{

//	private int id;
	public int productId;
	private int categoryId;
	public ProductDetailDAO productDetailDAO = new ProductDetailDAO();
	public ProductInfoDTO dto;
	public ArrayList<ProductInfoDTO> productDetailList;
	public ArrayList<ProductInfoDTO> categoryList;


	public String execute() {

		String result =ERROR;

		try{
			productDetailList = productDetailDAO.getDetail(productId);

			categoryList = productDetailDAO.categoryList(categoryId, productId);


		}catch(SQLException e){
			e.printStackTrace();
		}

		result = SUCCESS;
		return result;

}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
