package collections;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetPractice {

	public static void main(String[] args) {
Set<String>  set1 = new TreeSet<String>();
		
		set1.add("Don");
		set1.add("Adam");
		set1.add("Ford");
		set1.add("Don");

		System.out.println(set1);
		
		
	Set<Customers>  set2 = new TreeSet<Customers>(new MyComparator());
		
		set2.add(new Customers(103, "anand", 3000));
		set2.add(new Customers(107, "vishal", 5000));
		set2.add(new Customers(101, "rahul", 4000));
		set2.add(new Customers(104, "priya", 9000));
		
		System.out.println(set2);
		
		
		

	}

}
