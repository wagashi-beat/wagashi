package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

//import com.wagashi.DTO.Review2DTO;
import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.ProductDetailsDAO;
import com.wagashi.DTO.ProductDTO;

public class ProductDetailsAction extends ActionSupport implements SessionAware {

	// セッション情報取得
	public Map<String, Object> session;

	private String id;

	private String product_id;

	private int product_count;

	private String item_stock;
	private String error;
	private int insertFlg;

	private int price;
	private int category_id;

	// 購入個数リスト
	private List<Integer> stockList = new ArrayList<Integer>();

	// 商品詳細情報｢リスト
	public ArrayList<ProductDTO> productDTOList= new ArrayList<ProductDTO>();
	public ProductDTO productDTO= new ProductDTO();

	// お勧めリスト情報
	public List<ProductDTO> sugestList = new ArrayList<ProductDTO>();

	// レビュー情報｢リスト
	//public List<Review2DTO> reviewList = new ArrayList<Review2DTO>();

	private ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();

	public String execute() throws SQLException {

		// String[] productIdList = product_id.split(", ", 0);

		// 商品詳細情報取得メソッド
		//aaa
		try {
			productDTOList= productDetailsDAO.getProductDetailsInfo(product_id);

			if (productDTO != null) {
					session.put("d_image_file_path", productDTO.getImageFilePath());
					session.put("d_product_name_kana", productDTO.getProduct_name_kana());
					session.put("d_product_name", productDTO.getProduct_name());
					session.put("d_product_description", productDTO.getProduct_description());
					session.put("d_product_price", productDTO.getPrice());
					session.put("d_release_date", productDTO.getRelease_date());
					session.put("d_release_company", productDTO.getRelease_company());
					session.put("d_item_stock", productDTO.getItem_stock());
					session.put("d_product_id", productDTO.getProduct_id());
					session.put("d_product_count", productDTO.getProduct_count());
					session.put("d_category_id", productDTO.getCategory_id());
			} else {
				String result = ERROR;
				return result;
			}

		} catch (Exception e){
			e.printStackTrace();
		}



		// おすすめリスト情報取得
		try {
			sugestList = productDetailsDAO
					.getSugestProductInfo(Integer.parseInt((session.get("d_category_id")).toString()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// レビュー情報取得メソッド
		/*try {

			reviewList = productDetailsDAO.getReviewInfo(session.get("d_product_id").toString());

		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// 1から在庫数までの選択表示用List
		for (int i = 1; i <= productDTO.getItem_stock(); i++) {
			stockList.add(i);

		}

		if (session.get("d_category_id").equals("")) {
			return ERROR;
		}

		price = productDTO.getPrice();

		String result = SUCCESS;
		return result;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public String getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(String item_stock) {
		this.item_stock = item_stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * insertFlgを取得します。
	 *
	 * @return insertFlg
	 */
	public int getInsertFlg() {
		return insertFlg;
	}

	/**
	 * insertFlgを設定します。
	 *
	 * @param insertFlg
	 *            insertFlg
	 */
	public void setInsertFlg(int insertFlg) {
		this.insertFlg = insertFlg;
	}

	public List<Integer> getStockList() {
		return stockList;
	}

	public void setStockList(List<Integer> stockList) {
		this.stockList = stockList;
	}

	public ProductDetailsDAO getProductDetailsDAO() {
		return productDetailsDAO;
	}

	public void setProductDetailsDAO(ProductDetailsDAO productDetailsDAO) {
		this.productDetailsDAO = productDetailsDAO;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


	public List<ProductDTO> getSugestList() {
		return sugestList;
	}

	public void setSugestList(List<ProductDTO> sugestList) {
		this.sugestList = sugestList;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

	public ProductDTO getProductDTO() {
		return productDTO;
	}

	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}






}
