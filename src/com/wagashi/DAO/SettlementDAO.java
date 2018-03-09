package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wagashi.DTO.CartDTO;
import com.wagashi.util.DBConnector;
import com.wagashi.util.DateUtil;

public class SettlementDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private DateUtil dateUtil= new DateUtil();
	private CartDTO cartDTO= new CartDTO();


	public void settlementComp(String userId) throws SQLException {
		String sql= "insert into purchase_history_info(user_id, product_id, product_count, price, regist_date) values(?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, cartDTO.getUserId());
			ps.setInt(2, cartDTO.getProductId());
			ps.setInt(3, cartDTO.getProductCount());
			ps.setInt(4, cartDTO.getPrice());
			ps.setString(5, dateUtil.getDate());

			ps.execute();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// DBのcart_infoの情報を全て削除する
	public void cartDelete(String userId) throws SQLException {
		String sql= "delete from cart_info where user_id= ? ";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, userId);

			ps.execute();
		}

		catch (SQLException e){
			e.printStackTrace();
		}

		finally {
			con.close();
		}
	}

}
