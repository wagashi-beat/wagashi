package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wagashi.DTO.MyPageDTO;
import com.wagashi.util.DBConnector;

public class MyPageDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	//ユーザー情報取得メソッド

	public ArrayList<MyPageDTO> getUserInfo(String user_id)throws SQLException{
		ArrayList<MyPageDTO> myPageDTOList = new ArrayList<MyPageDTO>();

		String sql="select * from user_info where user_id = ?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MyPageDTO dto = new MyPageDTO();
				dto.setUserId(resultSet.getString("user_id"));
				dto.setFirst_name(resultSet.getString("first_name"));
				dto.setFamiry_name(resultSet.getString("family_name"));
				dto.setFirst_name_kana(resultSet.getString("first_name_kana"));
				dto.setFamiry_name_kana(resultSet.getString("family_name_kana"));
				dto.setSex(resultSet.getString("sex"));
				dto.setEmail(resultSet.getString("email"));
				myPageDTOList.add(dto);
				}
			}catch(SQLException e){
				e.printStackTrace();
		}
		finally{
			con.close();
		}
		return myPageDTOList;
	}

}
