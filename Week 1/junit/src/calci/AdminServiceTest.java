package calci;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;



class AdminServiceTest {
	AdminService ai=new AdminService();
	Admin ad=new Admin();

	@Test
	void testCreateAdmin() {
		int actual=ai.createAdmin(ad);
		assertEquals(10,actual);
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateAdmin() {
		int actual=ai.updateAdmin(ad);
		assertEquals(20,actual);

	}

	@Test
	void testDeleteAdmin() {
		int actual=ai.deleteAdmin(30);
		assertEquals(30,actual);
	}

	@Test
	void testGetAdmin() {
		//fail("Not yet implemented");
		Admin expected=new Admin(1101,"username1","user1@123","Ajay","ajay@gmail.com",9876,"manager");
		Admin actual=ai.getAdmin(1101);
		//assertEquals(expected, actual, "Expected: " + expected + ", Actual: " + actual);
		System.out.println(expected);
		System.out.println(actual);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllAdmin() {
		//fail("Not yet implemented");
		//List<Admin> getadmin=new ArrayList<>();
		List<Admin>actual=ai.getAllAdmin();
		List<Admin>expected=new ArrayList<>();
		expected.add(new Admin(1101,"username1","user1@123","Ajay","ajay@gmail.com",9876,"manager"));
		assertEquals(expected,actual);
	}

}


