package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=	 DriverManager.getConnection("jdbc:mysql://localhost:3306/uday","root","uday");
	Statement st=con.createStatement();
	//String query="insert into employee value(50,'javeed',45000)";
	//String query="update employee set ename='uday' where eid=50";
	String query="delete from employee where eid=50";
	int count=st.executeUpdate(query);
	con.close();
	System.out.println(count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
