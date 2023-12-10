package oops;

public class Child extends Parent {
	
		int cid = 99;
		
		
		public Child() {
			super(); // Parent();
			System.out.println("Child() is called obj created..");
		}
		
		
		

	public static void main(String[] args) {


		Child c = new Child();
		
		System.out.println(c.cid);
		System.out.println(c.pid);
		
		System.out.println(c.toString());
		
		Parent p = new Parent();
		
			c.methodOne();
			
			System.out.println(p.toString());
			
			
		Object o1  = new Child();  // Runtime Polymorphism	
		Parent p1 = new Child();
		
	

	}




	@Override
	public String toString() {
		return "Child [cid=" + cid + "]";
	}
	
	@Override
	 void methodOne() {   // Runtime Polymorphism
		
		System.out.println("methodOne() from Child");
	}
	
	
	
	

}
