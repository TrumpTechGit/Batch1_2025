package com.trump.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TMDemo {

	public static void main(String[] args) throws Exception {
		//properties
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trumpb1","root","root");
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		try {
		st.executeUpdate("insert into student value(8,'SAM','VZG',2000)");
		con.commit();
		System.out.println("record inserted");
		} catch (SQLException se) {
			con.rollback();
			System.out.println("probelm occured :"+se);
		}
		con.close();
	}

}
