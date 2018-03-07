package com.wagashi.DTO;

public class SearchItemInfoDTO {
	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int price;
	private String searchFlg;
	private String descriptionAll;
	private String categoryId;
	private String releaseCompany;
	private String searchWords;

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getSearchFlg() {
		return searchFlg;
	}
	public void setSearchFlg(String searchFlg) {
		this.searchFlg = searchFlg;
	}

	public String getDescriptionAll() {
		return descriptionAll;
	}
	public void setDescriptionAll(String descriptionAll) {
		this.descriptionAll = descriptionAll;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	public void setSearchWords(String searchWords) {
		this.searchWords = searchWords;

	}
	public String getSearchWords() {
		return searchWords;
	}



}
