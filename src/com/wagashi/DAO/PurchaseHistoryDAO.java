package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wagashi.DTO.PurchaseHistoryDTO;
import com.wagashi.util.DBConnector;

public class PurchaseHistoryDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String user_id) throws SQLException {
		ArrayList<PurchaseHistoryDTO> purchaseHistoryDTO = new ArrayList<PurchaseHistoryDTO>();

		String sql = "SELECT * FROM purchase_history_info LEFT JOIN product_info ON purchase_history_info.product_id = product_info.product_id WHERE user_id  =? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setPrice(resultSet.getString("price"));
				dto.setProductCount(resultSet.getInt("product_Count"));
				dto.setId(resultSet.getInt("id"));
				purchaseHistoryDTO.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return purchaseHistoryDTO;
	}

	//チェックの入った商品履歴を削除

	public boolean purchaseHistoryDelete(String user_id,int id) throws SQLException{
		String sql="DELETE FROM purchase_history_info  WHERE user_id=? AND id=?";
		PreparedStatement ps;

		try{
			ps=connection.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, id);

			ps.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}



	}