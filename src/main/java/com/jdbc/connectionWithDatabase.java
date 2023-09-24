package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionWithDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/employees";
		String username = "root";
		String password = "root";

		// 1 Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//2 creating connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("connection established successfully");
		String query = "select * from students";
		// creating prepareStatement
		PreparedStatement ps = con.prepareStatement(query);
		System.out.println(ps);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println("checking!!!");
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
		}
		con.close();
	}

}
