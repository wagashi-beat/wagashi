package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wagashi.DTO.MyPageDTO;
import com.wagashi.util.DBConnector;

public class MyPageDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	//ユーザー情報取得メソッド

	public MyPageDTO getUserInfo(String user_id)throws SQLException{
		MyPageDTO dto = new MyPageDTO();

		String sql="select * from user_info where user_id = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				dto.setUser_id(resultSet.getString("user_id"));
				dto.setFamilyName(resultSet.getString("family_name"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setFamilyNameKana(resultSet.getString("family_name_kana"));
				dto.setFirstNameKana(resultSet.getString("first_name_kana"));
				dto.setSex(resultSet.getString("sex"));
				dto.setEmail(resultSet.getString("email"));
				dto.setAddress(resultSet.getString("address"));
				dto.setTelNumber(resultSet.getString("tel_number"));
				}
			}catch(SQLException e){
				e.printStackTrace();
		}
		finally{
			con.close();
		}
		return dto;
	}

}
