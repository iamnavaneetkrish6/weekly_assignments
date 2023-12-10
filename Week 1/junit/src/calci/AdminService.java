package calci;

 import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

 
 public class AdminService {
 
 public int createAdmin(Admin admin)
 {
 	return 10;
 }
 public int updateAdmin(Admin admin)
 {
 	return 20;
 }

 public int deleteAdmin(int adminid)
 {
 	return 30;
 }
 public Admin getAdmin(int adminid)
 { 
 	
 	Admin admin=new Admin(1101,"username1","user1@123","Ajay","ajay@gmail.com",9876,"manager");
 	return admin;
 }
 public List<Admin>getAllAdmin()
 {
	 List<Admin> admin=new ArrayList<>();
		admin.add(new Admin(1101,"username1","user1@123","Ajay","ajay@gmail.com",9876,"manager"));
 	return admin;
 }
 }