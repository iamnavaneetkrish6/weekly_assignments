package collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Customers> {
	@Override
	public int compare(Customers e1, Customers e2) {
		
		String s1 = e1.toString();
		String s2 = e2.toString();
		
		
		return  s1.compareTo(s2) ;
	}
}
