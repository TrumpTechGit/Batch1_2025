package com.trump;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class SelectDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trumpb1","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from students");
		//System.out.println(rs);
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("addrs")+" "+rs.getLong("mobile"));
		}
		con.close();
	}

}
