package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexa.entities.Employee;

public class EmployeeDAO { 

	Connection conn = DBUtil.getDBConnection();

	public int insertEmployee(Employee emp) {

		String insertQuery = "insert into Employee values(?,?,?)";

		int count = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return count;

	}

	public int updateEmployee(Employee emp) {
		int count = 0;

		String updateQuery = "update employee set ename = ? , salary = ?  where eid = ?";

		try {

			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, emp.getEname());
			pstmt.setDouble(2, emp.getSalary());
			pstmt.setInt(3, emp.getEid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deleteEmployee(int eid) {

		String deleteQuery = "delete from employee where eid = ?";
		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, eid);
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public Employee getEmployeeById(int eid) {

		String selectOne = "select * from Employee where eid = ?";

		Employee employee = null;

		try {

			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, eid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int eid1 = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");

				employee = new Employee(eid1, ename, salary);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;
	}

	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		String selectAll = "select * from employee";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectAll);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int eid1 = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");

				Employee employee = new Employee(eid1, ename, salary);

				list.add(employee);

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		
		return list;
	}

}
