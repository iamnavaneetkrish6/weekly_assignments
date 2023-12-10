package oops;

public  class Parent extends Object {
	
	 int pid = 100;
	
	
	public Parent() {
		super(); // Object();
		System.out.println("Parent() is called obj created..");
		
	}
	
	
	 void   methodOne() {
		
		System.out.println("methodOne() from Parent..");
	}


	@Override
	public  String toString() {
		return "Parent [pid=" + pid + "]";
	}
	
	

}
