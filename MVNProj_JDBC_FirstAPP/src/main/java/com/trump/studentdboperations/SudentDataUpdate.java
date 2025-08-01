package com.trump.studentdboperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SudentDataUpdate {
	
	// private static final String STUDENT_INSERT_QUERY = "insert into
	// trumpb1.students values (403,'Max','hyd',9988776655)";

	public static void main(String[] args) throws SQLException, Exception {

		// jdbc properties
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/trumpb1";
		String uname = "root";
		String pwd = "root";
		// create query
		// String STUDENT_INSERT_QUERY = "insert into trumpb1.students values
		// (403,'Max','hyd',9988776655)";

		// steps to insert record
		// 1. load driver class
		Class.forName(driverClass);

		// 2. create a connection
		Connection con = DriverManager.getConnection(url, uname, pwd);

		// 3. create a statement
		Statement st = con.createStatement();

		// 4. execute statement and 5. get results
		int count = st.executeUpdate("update students set mobile=7676889910 where id = 402");

		// 6. print the result
		if (count != 0)
			System.out.println("updated :" + count);

		// 7. close connection
		if (con != null)
			con.close();

	}

}
