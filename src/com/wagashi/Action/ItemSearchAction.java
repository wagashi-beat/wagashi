package com.wagashi.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.wagashi.DAO.ItemSearchDAO;
import com.wagashi.DTO.ProductDTO;
import com.wagashi.util.ProductListChange;
import com.wagashi.util.ZenkakuKatakanaToZenkakuHiragana;

public class ItemSearchAction extends ActionSupport implements SessionAware {

	private String category = "0"; // jspで選択したカテゴリ1~4(String型)
	private String searchWord = ""; // jspで記入した検索ワード 半角英数字ひらがな漢字 16文字以下
	private String searchMessage; // ～件hitしました or 検索結果がありません

	public Map<String, Object> session;

	// 検索結果格納 jspに表示
	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	private ItemSearchDAO itemSearchDAO = new ItemSearchDAO();

	private ZenkakuKatakanaToZenkakuHiragana zenkakuKatakanaToZenkakuHiragana = new ZenkakuKatakanaToZenkakuHiragana();

	// productListを9個ごとに格納したList
	private ArrayList<ArrayList<ProductDTO>> trueList = new ArrayList<>();

	private int pageSelect;

	private int pageCount;

	private List<Integer> pageList = new ArrayList<>();

	public String execute() throws SQLException {

		productList = itemSearchDAO.getItemInfo(searchWord, category);

		if (searchWord.matches("^[\\u30A0-\\u30FFー]+$")) {
			searchWord = zenkakuKatakanaToZenkakuHiragana.zenkakuHiraganaToZenkakuKatakana(searchWord);
		}

		Pattern p = Pattern.compile("^[0-9a-zA-Z_\\p{InHiragana}\\p{InCjkUnifiedIdeographs}ー]*$"); // 半角英数字、ひらがな漢字の判定
		Matcher m = p.matcher(searchWord);

		boolean isFind = m.find(); // searchWordが半角英数字、ひらがな漢字の場合trueを返す
									// カタカナ\\p{InKatakana}

		if (isFind) {

			if (productList.size() > 0) {
				int searchItemCount = productList.size();
				String count = Integer.toString(searchItemCount);
				setSearchMessage(count + "件の商品があります。");

			} else {
				setSearchMessage("検索結果がありません。");
			}

		} else {

			setSearchMessage("入力された文字が不正です。");
		}

		// productListを9個ごとに格納
		ProductListChange change = new ProductListChange();
		trueList = change.productListChange(productList);

		for (int i = 0; i < trueList.size(); i++) {
			pageList.add(i + 1);
		}

		// ページ表示の確認

		for (int i = 0; i < trueList.size(); i++) {
			if (i == pageSelect) {
				productList = trueList.get(i);
				break;
			}
		}

		Iterator<ProductDTO> iterator = productList.iterator();
		if (!(iterator.hasNext())) {
			productList = null;
		}
		return SUCCESS;

	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getSearchMessage() {
		return searchMessage;
	}

	public void setSearchMessage(String searchMessage) {
		this.searchMessage = searchMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}

	public ItemSearchDAO getItemSearchDAO() {
		return itemSearchDAO;
	}

	public void setItemSearchDAO(ItemSearchDAO itemSearchDAO) {
		this.itemSearchDAO = itemSearchDAO;
	}

	public ZenkakuKatakanaToZenkakuHiragana getZenkakuKatakanaToZenkakuHiragana() {
		return zenkakuKatakanaToZenkakuHiragana;
	}

	public void setZenkakuKatakanaToZenkakuHiragana(ZenkakuKatakanaToZenkakuHiragana zenkakuKatakanaToZenkakuHiragana) {
		this.zenkakuKatakanaToZenkakuHiragana = zenkakuKatakanaToZenkakuHiragana;
	}

	public ArrayList<ArrayList<ProductDTO>> getTrueList() {
		return trueList;
	}

	public void setTrueList(ArrayList<ArrayList<ProductDTO>> trueList) {
		this.trueList = trueList;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

}
