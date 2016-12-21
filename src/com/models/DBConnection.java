package com.models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection = null;

	public static Connection getActiveConnection() {

            
		try {
			Class.forName("com.mysql.jdbc.Driver");		
			
//			
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/games?"
							+ "user=root&password=01110126543&characterEncoding=utf8");
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
