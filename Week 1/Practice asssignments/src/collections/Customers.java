package collections;

import java.util.Objects;


public class Customers {
	private int eid;
	private String ename;
	private double salary;
	
	
	public Customers(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	
	


	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return eid == other.eid;
	}






	@Override
	public String toString() {
		return this.eid +"";
	}




}
