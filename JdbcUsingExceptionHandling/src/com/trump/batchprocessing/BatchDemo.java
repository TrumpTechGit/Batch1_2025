package com.trump.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) throws Exception {

		// jdbc properties
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/trumpb1";
		String uname = "root";
		String pwd = "root";
		String sq1_1 = "insert into students values(21,'Siva','HYD',778866)";
		String sq1_2 = "insert into students values(22,'Hari','HYD',778866)";
		String sq1_3 = "insert into students values(23,'Teja','HYD',778866)";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,uname,pwd);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		try {
			st.addBatch(sq1_1);
			st.addBatch(sq1_2);
			st.addBatch(sq1_3);
			int[] count = st.executeBatch();
			System.out.println(count[0]);
			System.out.println(count[1]);
			System.out.println(count[2]);
			con.commit();
			System.out.println("records inserted ....");
		} catch (SQLException se) {
			con.rollback();
			System.out.println("problem occured :"+se);
		}
		con.close();
	}

}
