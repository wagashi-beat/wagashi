package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wagashi.DTO.ProductInfoDTO;
import com.wagashi.util.DBConnector;

public class ProductDetailDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	public ProductInfoDTO productInfoDTO=new ProductInfoDTO();

	//商品詳細を取得

	public ArrayList<ProductInfoDTO> getDetail(int productId) throws SQLException{
			ArrayList<ProductInfoDTO> productDetailList = new ArrayList<ProductInfoDTO>();

		String sql=""
					+ "SELECT * "
					+ "FROM product_info"
					+ "INNER JOIN m_category"
					+ "ON product_info.category_id = m_category.category_id "
					+ "where product_id = ?";


		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet=preparedStatement.executeQuery();


			while(resultSet.next()){

				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setProductId(resultSet.getInt("product_id"));
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setProductDescription(resultSet.getString("product_description"));
				productInfoDTO.setCategoryId(resultSet.getString("category_id"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_path"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
				productDetailList.add(productInfoDTO);


			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return productDetailList ;
	}

	//同じカテゴリーの商品を取得

	public ArrayList<ProductInfoDTO> categoryList(int categoryId,int removeProduct_Id) throws SQLException{
			ArrayList<ProductInfoDTO> categoryList = new ArrayList<ProductInfoDTO>();
		String sql =""
				+"SELECT * "
				+"FROM product_info"
				+"INNER JOIN m_category"
				+"ON product_info.category_id = m_category.category_id"
				+"where product_info.category_id=?"
				+"AND product_into.product_id !=?"
				+"order by rand()"
				+"LIMIT 3";


		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, categoryId);
			preparedStatement.setInt(2, removeProduct_Id);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){

				ProductInfoDTO productInfoDTO = new ProductInfoDTO();
				productInfoDTO.setProductId(resultSet.getInt("product_id"));
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setProductDescription(resultSet.getString("product_description"));
				productInfoDTO.setCategoryId(resultSet.getString("category_id"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_path"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_name"));

				categoryList.add(productInfoDTO);

		}

	}catch(Exception e){
		e.printStackTrace();
	}

	return categoryList;

	}



}
