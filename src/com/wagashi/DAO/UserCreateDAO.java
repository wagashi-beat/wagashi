package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wagashi.util.DBConnector;
import com.wagashi.util.DateUtil;

public class UserCreateDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private DateUtil dateUtil= new DateUtil();

	private String sql= "insert into user_info (user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, regist_date ) values( ?,?,?,?,?,?,?,?,?)";

	// create作成
	public void create(String userId, String password, String familyName, String firstName, String familyNameKana, String firstNameKana, int sex, String email) throws SQLException {

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyNameKana);
			ps.setString(6, firstNameKana);
			ps.setInt(7, sex);
			ps.setString(8, email);
			ps.setString(9, dateUtil.getDate());

			ps.execute();
		}

		catch (Exception e){
			e.printStackTrace();
		}

		finally {
			con.close();
		}
	}


	public boolean checkId(String user_id) throws SQLException {
		boolean result= false;
		Connection con= db.getConnection();

		String sql= "select * from user_info where user_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user_id);
			ResultSet rs= ps.executeQuery();

			if (rs.next()) {
				result= true;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			con.close();
		}

		return result;
	}


}
