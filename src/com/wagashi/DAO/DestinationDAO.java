package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wagashi.DTO.MyPageDTO;
import com.wagashi.util.DBConnector;

public class DestinationDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();


	public void destinationCreate (String familyName, String firstName, String familyNameKana, String firstNameKana, String address, String telNumber, String email, String user_id) throws SQLException {

		String sql= "update user_info set family_name= ?, first_name= ?, family_name_kana= ?, first_name_kana= ?, address= ?, tel_number= ?, email= ? where user_id= ? ";

		try {
			PreparedStatement ps= con.prepareStatement(sql);

			ps.setString(1, familyName);
			ps.setString(2, firstName);
			ps.setString(3, familyNameKana);
			ps.setString(4, firstNameKana);
			ps.setString(5, address);
			ps.setString(6, telNumber);
			ps.setString(7, email);
			ps.setString(8, user_id);

			ps.execute();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			con.close();
		}
	}

	public MyPageDTO getDestination(String user_id) throws SQLException{
		String sql= "select * from user_info where user_id = ?";
		MyPageDTO dto = new MyPageDTO();

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet resultSet = ps.executeQuery();

			if(resultSet.next()){
				dto.setUser_id(resultSet.getString("user_id"));
				dto.setFamilyName(resultSet.getString("family_name"));
				dto.setFamilyNameKana(resultSet.getString("family_name_kana"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setFirstNameKana(resultSet.getString("first_name_kana"));
				dto.setEmail(resultSet.getString("email"));
				dto.setTelNumber(resultSet.getString("tel_number"));
				dto.setAddress(resultSet.getString("address"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}

}