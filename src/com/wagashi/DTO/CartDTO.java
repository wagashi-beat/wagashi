package com.wagashi.DTO;

public class CartDTO extends ProductInfoDTO{

	private String userId;
	private String tempUserId;
	private int productId;
	private String productName;
//購入個数
	private int productCount;
	private int price;
	private String imageFilePath;
	private String imageFileName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTempUserId() {
		return tempUserId;
	}

	public void setTempUserId(String tempUserId) {
		this.tempUserId = tempUserId;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}





}
