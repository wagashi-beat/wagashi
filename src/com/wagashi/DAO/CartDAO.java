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
	private CartDTO cartDTO = new CartDTO();


	//ログイン時のカート情報取得
	/* public ArrayList<CartDTO> loginGetCartInfo(String user_id)throws SQLException{
		ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

		String sql = "SELECT cart_info.id, product_info.product_id, product_info.product_name, product_info.product_name_kana, product_info.image_file_path, product_info.price, cart_info.product_count FROM cart_info LEFT JOIN product_info ON cart_info.product_id = product_info.product_id WHERE cart_info.user_id = ?";
			try{
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1, user_id);
				ResultSet resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){
					cartDTO.setId(resultSet.getInt("id"));
					cartDTO.setProduct_id(resultSet.getInt("product_id"));
					cartDTO.setProductName(resultSet.getString("product_name"));
					cartDTO.setProductNameKana(resultSet.getString("product_name_kana"));
					cartDTO.setProductCount(resultSet.getInt("product_count"));
					cartDTO.setPrice(resultSet.getInt("product_count")*resultSet.getInt("price"));
					cartDTO.setImageFilePath(resultSet.getString("image_file_path"));
					cartDTO.setImageFileName(resultSet.getString("image_file_name"));
					cartDTOList.add(cartDTO);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}

			return cartDTOList;
	}


	/* //ログイン時のカート追加メソッド
	public ArrayList<CartDTO> loginCartAdd (String user_id, int product_id, int productCount, int price) throws SQLException{

	String sql= "insert into cart_info(user_id, product_id, product_count, price) values (?, ?, ?, ?)";

	ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();
		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			preparedStatement.setInt(2, product_id);
			preparedStatement.setInt(3, productCount);
			preparedStatement.setInt(4, price);

			preparedStatement.execute();

		}catch(SQLException e){
			e.printStackTrace();
		}
		return cartDTOList;
	}


	// product_id、priceをcartDTOへ格納
	public ArrayList<CartDTO> getProductId(int product_id) {
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
		String sql= "SELECT * FROM product_info WHERE product_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, product_id);
			ResultSet rs= ps.executeQuery();

			if (rs.next()) {
				cartDTO.setProduct_id(rs.getInt("product_id"));
				cartDTO.setPrice(rs.getInt("price"));
				cartList.add(cartDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cartList;
	}


	// 同じ商品の統合
	public void updateCountCart(int productCount, int product_id) throws SQLException {
		String sql= "UPDATE cart_info SET product_count= product_count +? WHERE product_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, productCount);
			ps.setInt(2, product_id);
			ps.executeUpdate();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// 同じ商品ではない場合
	public void noUpdateCountCart(String user_id, int product_id, int productCount, int price) throws SQLException {
		String sql= "INSERT INTO cart_info (user_id, product_id, product_count, price) VALUES(?,?,?,?,?)";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, product_id);
			ps.setInt(3, productCount);
			ps.setInt(4, price);

			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//ログイン時のカート内の商品削除

	public boolean loginCartDelete(String user_id,int id) throws SQLException{
		String sql="delete from cart_info where user_id = ? and id = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
}

	未ログイン時のカート追加メソッド
	public ArrayList<CartDTO> noLoginCartAdd (String temp_user_id, int product_id, int productCount, int price) throws SQLException{
		String sql= "insert into cart_info(temp_user_id, product_id, product_count, price, regist_date) values (?, ?, ?, ?, ?)";
		ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, temp_user_id);
			preparedStatement.setInt(2, product_id);
			preparedStatement.setInt(3, productCount);
			preparedStatement.setInt(4, price);
			preparedStatement.setString(5, dateUtil.getDate());

			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return cartDTOList;
	} */


	/*未ログイン時のカート情報取得メソッド
	public ArrayList<CartDTO> noLoginGetCartInfo(String temp_user_id)throws SQLException{

		ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

		String sql ="select * from cart_info left join product_info on cart_info.product_id = product_info.product_id where cart_info.temp_user_id = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, temp_user_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				CartDTO dto = new CartDTO();
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductCount(resultSet.getInt("product_count"));
				dto.setPrice(resultSet.getInt("product_count")*resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setImageFileName(resultSet.getString("image_file_name"));
				cartDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return cartDTOList;
	} */


	/* 未ログイン時のカート内の商品削除
	public void noLoginCartDelete(String temp_user_id,int product_id)throws SQLException{
		String sql = "delete from cart_info where temp_user_id = ? and product_id = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, temp_user_id);
			preparedStatement.setInt(2, product_id);
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	} */


	/* 未ログイン時同じ商品の統合
	public void noLoginUpdateCartAdd(int updateCount, String temp_user_id, int product_id){
		String sql= "UPDATE cart_info SET product_count= ? WHERE temp_user_id= ? AND product_id= ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, updateCount);
			preparedStatement.setString(2, temp_user_id);
			preparedStatement.setInt(3, product_id);
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	} */





// 未ログイン時のカート追加メソッド
public ArrayList<CartDTO> loginCartAdd (String user_id, int product_id, int productCount, int price) throws SQLException{
	String sql= "insert into cart_info(user_id, product_id, product_count, price, regist_date) values (?, ?, ?, ?, ?)";
	ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, user_id);
		preparedStatement.setInt(2, product_id);
		preparedStatement.setInt(3, productCount);
		preparedStatement.setInt(4, price);
		preparedStatement.setString(5, dateUtil.getDate());

		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return cartDTOList;
}


// 未ログイン時のカート情報取得メソッド
public ArrayList<CartDTO> loginGetCartInfo(String user_id)throws SQLException{

	ArrayList<CartDTO> cartDTOList = new ArrayList<CartDTO>();

	String sql ="select * from cart_info left join product_info on cart_info.product_id = product_info.product_id where cart_info.user_id = ?";

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, user_id);
		ResultSet resultSet = preparedStatement.executeQuery();

		while(resultSet.next()){
			CartDTO dto = new CartDTO();
			dto.setProductId(resultSet.getInt("product_id"));
			dto.setProductName(resultSet.getString("product_name"));
			dto.setProductCount(resultSet.getInt("product_count"));
			dto.setPrice(resultSet.getInt("product_count")*resultSet.getInt("price"));
			dto.setImageFilePath(resultSet.getString("image_file_path"));
			dto.setImageFileName(resultSet.getString("image_file_name"));
			cartDTOList.add(dto);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return cartDTOList;
}


//未ログイン時のカート内の商品削除
public void loginCartDelete(String user_id,int product_id)throws SQLException{
	String sql = "delete from cart_info where user_id = ? and product_id = ?";

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, user_id);
		preparedStatement.setInt(2, product_id);
		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}
}


// 未ログイン時同じ商品の統合
public void updateCartAdd(int updateCount, String user_id, int product_id){
	String sql= "UPDATE cart_info SET product_count= ? WHERE user_id= ? AND product_id= ?";

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, updateCount);
		preparedStatement.setString(2, user_id);
		preparedStatement.setInt(3, product_id);
		preparedStatement.execute();
	}catch(SQLException e){
		e.printStackTrace();
	}
}
}


