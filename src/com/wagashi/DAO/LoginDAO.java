package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wagashi.DTO.LoginDTO;
import com.wagashi.util.DBConnector;


public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * ユーザー登録情報取得メソッド
	 * @param loginUserId
	 * @param loginPassword
	 * @return LoginDTO
	 */

public LoginDTO getUserInfo(String userId,String password){

	String sql = "SELECT * FROM user_info where user_id = ? AND password = ?";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,userId);
		preparedStatement.setString(2,password);

		ResultSet resultSet = preparedStatement.executeQuery();

		if(resultSet.next()) {
			loginDTO.setLoginId(resultSet.getString("user_id"));
			loginDTO.setLoginPassword(resultSet.getString("password"));

		if(!(resultSet.getString("user_id").equals(null))) {
			loginDTO.setLoginFlg(true);
		}
	}
}catch(Exception e) {
	e.printStackTrace();
}

return loginDTO;

}


	String sql2= "select count(*) from user_info where user_id= ?";
	public int userCheck(String userId) throws SQLException {
		int userCount= 0;

		try {
			PreparedStatement ps= connection.prepareStatement(sql2);
			ps.setString(1, userId);
			ResultSet rs= ps.executeQuery();
			if(rs.next()){
				userCount= rs.getInt("count(*)");
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return userCount;
	}


public LoginDTO getLoginDTO() {
	return loginDTO;

}

}
