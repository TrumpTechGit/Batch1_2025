import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnTest {

	public static void main(String[] args) throws SQLException,Exception {

		// jdbc properties
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/trumpb1";
		String uname = "root";
		String pwd = "root";

		// jdbc code
		// 1. load the driver
		Class.forName(driverClass);

		// 2. create the connection
		Connection con = DriverManager.getConnection(url, uname, pwd);

		if (con != null)
			System.out.println(con);
		else
			System.out.println("connection failed");

	}

}
