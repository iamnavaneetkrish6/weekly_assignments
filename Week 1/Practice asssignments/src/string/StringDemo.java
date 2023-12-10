package string;

public class StringDemo {

	public static void main(String[] args) {

		 String name1 = "hello";
		 
		 String name3 = "hello";
		 
		 String name2 = new String("Javeed");
		
		 String name4 = new String("Javeed");
		 
		 System.out.println("Compare Values 1,3 "+name1.equals(name3)); 
		 System.out.println(name1 == name3);
		 System.out.println(name1.hashCode());
		 System.out.println(name3.hashCode());
		 
		 System.out.println("Compare vlues 2,4 "+ name2.equals(name4));
		 System.out.println(name2 == name4);

		
		 String s1 = "A";
		 String s2 = "B";
		 
		 	System.out.println(s1.compareTo(s2)); 
		 				//A,B    65-66    = -1   already sorted order
		 	
		 	System.out.println(s2.compareTo(s1)); 
		 	//B,A  66 - 65   = 1  need to do sorting or swap
		 	
		 	//System.out.println(s1.compareTo(s2)); // 65-65 = 0 dont do anything
		 
		 	
		 	String city1 = "HYDERABAD";
		 	String city2 = "hyderabad";
		 	
		 System.out.println(city1.equalsIgnoreCase(city2));
		 	
		 
		 // string is immutable
		 
		 String  name =  "javeed";
		 name = name.concat("mohammed");
		 name = name + "husnuddin";
		 
		 // StringBuffer or StringBuilder  they are Mutable in nature
		 
		 StringBuffer sb = new StringBuffer("ashwini");
		 
		 	sb = sb.append("tiwari");
		 		sb.append("sir");
		 		
		 		
		 		System.out.println(sb);
		 		System.out.println(sb.reverse());
		 
		 		// StringBuffer is Thread safe or Synchronize , cannot be use for multi threading
		 		 
		 		//StringBuilder is not Thread safe or Asynchronize , it can be use for multi threading
		 
	}

}
