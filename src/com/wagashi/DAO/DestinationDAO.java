package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wagashi.util.DBConnector;
import com.wagashi.util.DateUtil;

public class DestinationDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private DateUtil dateUtil= new DateUtil();

	private String sql= "insert into destination_info (user_id, family_name, fisrt_name, family_name_kana, first_name_kana, user_address, tel_number, email, regist_date) values(?,?,?,?,?,?,?,?,?)";
	private String sql_id= "select * from destination_info where user_id = ?";

	public void destinationCreate (String userId, String familyName, String firstName, String familyNameKana, String firstNameKana, String address, String telNumber, String email) throws SQLException {

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			PreparedStatement ps2= con.prepareStatement(sql_id);

			ps2.setString(1, userId);

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

}