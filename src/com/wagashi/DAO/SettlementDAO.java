package com.wagashi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wagashi.util.DBConnector;
import com.wagashi.util.DateUtil;

public class SettlementDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private DateUtil dateUtil= new DateUtil();


	public void settlementComp(String user_id, int product_id, int productCount, int price) throws SQLException {
		String sql= "insert into purchase_history_info(user_id, product_id, product_count, price, regist_date) values(?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, product_id);
			ps.setInt(3, productCount);
			ps.setInt(4, price);
			ps.setString(5, dateUtil.getDate());

			ps.execute();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// DBのcart_infoの情報を全て削除する
	public void cartDelete(String user_id) throws SQLException {
		String sql= "delete from cart_info where user_id= ? ";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user_id);

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
