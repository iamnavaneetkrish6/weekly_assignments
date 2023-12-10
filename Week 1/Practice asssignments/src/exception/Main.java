package exception;

public class Main {

	public static void main(String[] args) {

			int accounts[] = {101,102,103,104,105};
			String names[] = {"Tom","Smith","Ravi","Ford","Jerry"};
			double balance[] = {4000,3000,7000,90,5000};
		
			for (int i = 0; i < accounts.length; i++) {
				
	System.out.println(accounts[i] +" "+names[i]+" "+balance[i]);
				
				if(balance[i]  < 1000) {
					try {
					throw new LowBalanceException();
					}
					catch(LowBalanceException e) {
						
						System.err.println(names[i]+" Your balance is low plz deposit some amount");
						
					}
				}
	
				
			}
				
			
			
			
			
	}

}
