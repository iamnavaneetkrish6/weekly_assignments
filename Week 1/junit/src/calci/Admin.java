package calci;

import java.util.Objects;

public class Admin {
	private int adminid;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private int phonenumber;
    private String role;
	public Admin() {
		super();
	}
	

	public Admin(int adminid, String username, String password, String fullname, String email, int phonenumber,
			String role) {
		super();
		this.adminid = adminid;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.role = role;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	/*
	 * @Override public String toString() { return "Admin [adminid=" + adminid +
	 * ", username=" + username + ", password=" + password + ", fullname=" +
	 * fullname + ", email=" + email + ", phonenumber=" + phonenumber + ", role=" +
	 * role + "]"; }
	 */


	@Override
	public int hashCode() {
		return Objects.hash(adminid, email, fullname, password, phonenumber, role, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return adminid == other.adminid && Objects.equals(email, other.email)
				&& Objects.equals(fullname, other.fullname) && Objects.equals(password, other.password)
				&& phonenumber == other.phonenumber && Objects.equals(role, other.role)
				&& Objects.equals(username, other.username);
	}
	
}
	
    
