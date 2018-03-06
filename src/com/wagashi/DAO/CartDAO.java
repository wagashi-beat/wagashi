package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wagashi.DTO.CartDTO;
import com.wagashi.util.DBConnector;
import com.wagashi.util.DateUtil;

public class CartDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil= new DateUtil();

	//ログイン時のカート追加メソッド
public void loginCartAdd(String userId,int productId,int productCount,int price)throws SQLException{

	String sql="insert into user_info(user_id,product_id,product_count,price,regist_date)values(?,?,?,?,?)";

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, userId);
		preparedStatement.setInt(2, productId);
		preparedStatement.setInt(3, productCount);
		preparedStatement.setInt(4, price);
		preparedStatement.setString(5,dateUtil.getDate());

		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		con.close();
	}
}

//未ログイン時のカート追加メソッド
public void noLoginCartAdd(String tempUserId,int productId,int productCount,int price) throws SQLException{

	String sql="inset into user_info(temp_user_id,product_id,product_count_price,regist_date)";

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, tempUserId);
		preparedStatement.setInt(2, productId);
		preparedStatement.setInt(3, productCount);
		preparedStatement.setInt(4, price);
		preparedStatement.setString(5, dateUtil.getDate());

		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		con.close();
	}
}

//ログイン時のカート情報取得メソッド
public ArrayList<CartDTO> loginGetCartInfo(String userId)throws SQLException{
	ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	String sql = "select * from cart_info left join product_info on cart_info.product_id = product_info.product_id where cart_info.user_id = ?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, userId);
		ResultSet resultSet = preparedStatement.executeQuery();

		while(resultSet.next()){
			CartDTO dto = new CartDTO();
			dto.setUserId(resultSet.getString("user_id"));
			dto.setProductId(resultSet.getInt("product_id"));
			dto.setProductName(resultSet.getString("product_name"));
			dto.setProductCount(resultSet.getInt("product_count"));
			dto.setPrice(resultSet.getInt("price"));
			dto.setImageFilePath(resultSet.getString("image_file_path"));
			dto.setImageFileName(resultSet.getString("image_file_name"));
			cartDTOList.add(dto);
		}

	con.close();
	return cartDTOList;
}

//未ログイン時のカート情報取得メソッド
public ArrayList<CartDTO> noLoginGetCartInfo(String tempUserId)throws SQLException{

	ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	String sql = "select * from cart_info where user_id = ?";

	PreparedStatement preparedStatement = con.prepareStatement(sql);
	preparedStatement.setString(1, tempUserId);
	ResultSet resultSet = preparedStatement.executeQuery();

	while(resultSet.next()){
		CartDTO dto = new CartDTO();
		dto.setTempUserId(resultSet.getString("temp_user_id"));
		dto.setProductId(resultSet.getInt("product_id"));
		dto.setProductName(resultSet.getString("product_name"));
		dto.setProductCount(resultSet.getInt("product_count"));
		dto.setPrice(resultSet.getInt("price"));
		dto.setImageFilePath(resultSet.getString("image_file_path"));
		dto.setImageFileName(resultSet.getString("image_file_name"));
		cartDTOList.add(dto);
	}
	con.close();
	return cartDTOList;
}

//ログイン時のカート内の商品削除

public void loginCartDelete(String userId,int productId) throws SQLException{

	String sql="delete from cart_info where user_id = ? and product_id = ?";

	PreparedStatement preparedStatement = con.prepareStatement(sql);
	preparedStatement.setString(1, userId);
	preparedStatement.setInt(2, productId);
	preparedStatement.execute();
}

//未ログイン時のカート内の商品削除

public void noLoginCartDelete(String tempUserId,int productId)throws SQLException{
	String sql = "delete from cart_info where user_id = ? and product_id = ?";

	PreparedStatement preparedStatement = con.prepareStatement(sql);
	preparedStatement.setString(1, tempUserId);
	preparedStatement.setInt(2, productId);
	preparedStatement.execute();
}

}
