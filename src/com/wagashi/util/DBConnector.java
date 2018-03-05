package com.wagashi.util;

import com.mysql.jdbc.Connection;


public class DBConnector {
	private String driverName= "com.mysql.jdbc.Driver";
	private String url= "jdbc:mysql://localhost/wagashi";
	private String user= "root";
	private String password= "mysql";

	public Connection getConnection() {
		Connection con= null;

		try {
			Class.forName (driverName);
			con= DriverManager.getConnection (url, user, password);
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

}
