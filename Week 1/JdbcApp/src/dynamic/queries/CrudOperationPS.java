package dynamic.queries;

import java.util.List;
import java.util.Scanner;

import com.hexa.entities.*;
import dao.EmployeeDAO;
public class CrudOperationPS { 

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAO();

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("Welcome to EMS");
			System.out.println("1. INSERT EMPLOYEE");
			System.out.println("2. UPDATE EMPLOYEE");
			System.out.println("3. DELETE BY  EMPLOYEE ID");
			System.out.println("4. GET EMPLOYEE BY ID");
			System.out.println("5. GET ALL EMPLOYEES ");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:

				System.out.println("Enter Eid");
				int eid = scanner.nextInt();
				System.out.println("Enter Ename");
				scanner.nextLine(); 
				String ename = scanner.nextLine();
				System.out.println("Enter Salary");
				double salary = scanner.nextDouble();

				Employee emp = new Employee(eid, ename, salary);

				int count = dao.insertEmployee(emp);

				System.out.println(count + "record affected");

				break;

			case 2:

				System.out.println("Enter Eid");
				int eid1 = scanner.nextInt();
				System.out.println("Enter Ename");
				scanner.nextLine();
				String ename1 = scanner.nextLine();
				System.out.println("Enter Salary");
				double salary1 = scanner.nextDouble();

				Employee emp1 = new Employee(eid1, ename1, salary1);

				int count1 = dao.updateEmployee(emp1);

				System.out.println(count1 + "  record affected");

				break;

			case 3:

				System.out.println("Enter Eid to Delete Record");
				int eid2 = scanner.nextInt();
				int count2 = dao.deleteEmployee(eid2);

				System.out.println(count2 + "  record affected");

				break;

			case 4:
				System.out.println("Enter Eid to Search Employee Record");
				int eid3 = scanner.nextInt();
				
				Employee employee =	dao.getEmployeeById(eid3);
							
				System.out.println(employee);

				break;
				
			case 5:
				  List<Employee>  list =   dao.getAllEmployees();
				  
				  	for (Employee empObj : list) {
				  		System.out.println(empObj);
						
					}
				  
				  break;
				  
			case 0:

				flag = false;

				break;

			default:
				
				System.err.println("Invalid Input");
				
				break;
			}

		}

	}

}
