package com.trump;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class JdbcUsingExceptionHandlling {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("driver class is invalid :"+cnfe);
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trumpb1","root","root");
			Statement st = con.createStatement();
			int count = st.executeUpdate("Update Students set mobile= 0000000000 where id=402 ");
			System.out.println(count);
			con.close();
		} catch ( SQLSyntaxErrorException   e1) {
			System.out.println("Error in sql syntax "+e1);
		} catch (SQLException e2) {
			System.out.println("error in JDBC code "+e2);
		}
		
		
	}

}
