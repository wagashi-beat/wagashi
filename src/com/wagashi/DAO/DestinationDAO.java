package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wagashi.DTO.DestinationDTO;
import com.wagashi.util.DBConnector;
import com.wagashi.util.DateUtil;

public class DestinationDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private DateUtil dateUtil= new DateUtil();





	public void destinationCreate (String userId, String familyName, String firstName, String familyNameKana, String firstNameKana, String address, String telNumber, String email) throws SQLException {

		String sql= "insert into destination_info (user_id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email, regist_date) values(?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps= con.prepareStatement(sql);


			ps.setString(1, userId);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyNameKana);
			ps.setString(5, firstNameKana);
			ps.setString(6, address);
			ps.setString(7, telNumber);
			ps.setString(8, email);
			ps.setString(9, dateUtil.getDate());

			ps.execute();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			con.close();
		}
	}
	public DestinationDTO getDestination(String userId) throws SQLException{
		String sql= "select * from destination_info where user_id = ?";
		DestinationDTO dto = new DestinationDTO();
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet resultSet = ps.executeQuery();

			if(resultSet.next()){
				dto.setUserId(resultSet.getString("user_id"));
				dto.setFamilyName(resultSet.getString("family_name"));
				dto.setFamilyNameKana(resultSet.getString("family_name_kana"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setFirstNameKana(resultSet.getString("first_name_kana"));
				dto.setEmail(resultSet.getString("email"));
				dto.setTelNumber(resultSet.getString("tel_number"));
				dto.setAddress(resultSet.getString("user_address"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}

}