package crud.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {  // Factory Class

	public static Connection getDBConnection() { // Factory method

		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bus", "root", "Navaneet@6");

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;

	}

}