package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wagashi.util.DBConnector;

public class PasswordChangeDAO {
	DBConnector db= new DBConnector();
	Connection con= db.getConnection();

	public void newPassword(String newPassword, String userId) {
		String sql= "update user_info set password= ? where user_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2, userId);
			ps.executeUpdate();
		}

		catch (Exception e){
			e.printStackTrace();

		}
	}

}
