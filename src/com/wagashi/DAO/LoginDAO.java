package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

public LoginDTO getUserInfo(String user_id,String password){

	String sql = "SELECT * FROM user_info where user_id = ? AND password = ?";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,user_id);
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

public LoginDTO getLoginDTO() {
	return loginDTO;

}

}
