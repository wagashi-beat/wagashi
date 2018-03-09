package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wagashi.util.DBConnector;

public class PasswordChangeDAO {
	DBConnector db= new DBConnector();
	Connection con= db.getConnection();

	public void newPassword(String userId, String newPassword) {
		String sql= "update user_info set password= ? where user_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, newPassword);
			ps.executeUpdate();
		}

		catch (Exception e){
			e.printStackTrace();

		}
	}

}
